package com.ss.android.ugc.aweme.pipfeed.components.single;

import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.EnumC48779JCl;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS46S1000000_8;

/* loaded from: classes9.dex */
public final class PipStatusViewViewModel extends ViewModel {
    public static final List<OSZ<EnumC48779JCl, EnumC48779JCl>> LJLJJI;
    public static final List<EnumC48779JCl> LJLJJL;
    public static final List<EnumC48779JCl> LJLJJLL;
    public final MutableLiveData<EnumC48779JCl> LJLIL = new MutableLiveData<>(EnumC48779JCl.LOADING_BLACKOUT);
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    static {
        EnumC48779JCl enumC48779JCl = EnumC48779JCl.NET_ERROR;
        EnumC48779JCl enumC48779JCl2 = EnumC48779JCl.LOADING;
        EnumC48779JCl enumC48779JCl3 = EnumC48779JCl.NO_STATUS;
        EnumC48779JCl enumC48779JCl4 = EnumC48779JCl.SCREEN_TIME_LIMIT;
        LJLJJI = C47261Igj.LJJIJIIJI(new OSZ(enumC48779JCl, enumC48779JCl2), new OSZ(enumC48779JCl, enumC48779JCl3), new OSZ(enumC48779JCl2, enumC48779JCl4));
        LJLJJL = C47261Igj.LJJIJIIJI(enumC48779JCl3, EnumC48779JCl.TRANSITION, enumC48779JCl2);
        LJLJJLL = C47261Igj.LJJIJIIJI(enumC48779JCl2, EnumC48779JCl.LOADING_BLACKOUT, enumC48779JCl, enumC48779JCl4);
    }

    public PipStatusViewViewModel() {
        new MutableLiveData(EnumC48779JCl.SCREEN_TIME_LIMIT);
        this.LJLILLLLZI = new MutableLiveData<>(Boolean.FALSE);
        this.LJLJI = C221108m2.LIZIZ(new AqS46S1000000_8("PipStatusViewViewModel", 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r2 = (X.AbstractC48820JEa) r7.LJLJI.getValue();
        r1 = X.X1D.LIZ();
        r1.append("start transition from ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r3 = r5.name();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r1.append(r3);
        r1.append(" to ");
        r1.append(r8.name());
        r2.LJIIIIZZ(X.X1D.LIZIZ(r1));
        r7.LJLIL.setValue(r8);
        r7.LJLILLLLZI.setValue(java.lang.Boolean.valueOf(!com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LJLJJL.contains(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(X.EnumC48779JCl r8) {
        /*
            r7 = this;
            java.lang.String r0 = "newStatus"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            androidx.lifecycle.MutableLiveData<X.JCl> r0 = r7.LJLIL
            java.lang.Object r5 = r0.getValue()
            X.JCl r5 = (X.EnumC48779JCl) r5
            java.lang.String r4 = " to "
            r3 = 0
            if (r5 == r8) goto L33
            java.util.List<X.OSZ<X.JCl, X.JCl>> r0 = com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LJLJJI
            java.util.Iterator r6 = r0.iterator()
        L18:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            if (r0 != r5) goto L18
            java.lang.Object r0 = r1.getSecond()
            if (r0 != r8) goto L18
            if (r2 == 0) goto L59
        L33:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "illegal transition from "
            r1.append(r0)
            if (r5 == 0) goto L42
            java.lang.String r3 = r5.name()
        L42:
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "log"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            return
        L59:
            X.Ol8 r0 = r7.LJLJI
            java.lang.Object r2 = r0.getValue()
            X.JEa r2 = (X.AbstractC48820JEa) r2
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "start transition from "
            r1.append(r0)
            if (r5 == 0) goto L70
            java.lang.String r3 = r5.name()
        L70:
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.LJIIIIZZ(r0)
            androidx.lifecycle.MutableLiveData<X.JCl> r0 = r7.LJLIL
            r0.setValue(r8)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r7.LJLILLLLZI
            java.util.List<X.JCl> r0 = com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LJLJJL
            boolean r0 = r0.contains(r8)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.gv0(X.JCl):void");
    }
}
