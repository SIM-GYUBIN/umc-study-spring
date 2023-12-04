package umc.study.base;

import umc.study.base.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(Code errorCode) {
        super(errorCode);
    }
}