package com.bytedance.android.live.broadcast.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SurveyResponse extends F9E {

    @InterfaceC65349Pkn("course_theme")
    public final AcademyCourseTheme courseTheme;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.courseTheme};
    }

    public SurveyResponse(AcademyCourseTheme courseTheme) {
        o.LJIIIZ(courseTheme, "courseTheme");
        this.courseTheme = courseTheme;
    }
}
