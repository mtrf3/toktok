package com.bef.effectsdk;

/* loaded from: classes.dex */
public final class RequirementResourceMapper {
    public static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}
