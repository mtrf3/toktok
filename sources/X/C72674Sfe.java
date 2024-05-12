package X;

import com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorFragment;
import java.util.List;

/* renamed from: X.Sfe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72674Sfe extends AbstractC65781Prl implements InterfaceC88471Ynr<AML, List<? extends InterfaceC72603SeV>, C76800UCe> {
    public final /* synthetic */ ProfileNaviEditorFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72674Sfe(ProfileNaviEditorFragment profileNaviEditorFragment) {
        super(2);
        this.LJLIL = profileNaviEditorFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r1.getBoolean("EDIT_TEMPLATE_FROM_CREATION") == true) goto L10;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.AML r10, java.util.List<? extends X.InterfaceC72603SeV> r11) {
        /*
            r9 = this;
            java.util.List r11 = (java.util.List) r11
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            if (r11 == 0) goto L50
            com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorFragment r6 = r9.LJLIL
            X.Vej r1 = r6.LJLZ
            r8 = 0
            java.lang.String r7 = "navi_editor_viewpager_tab_strip"
            if (r1 == 0) goto L5f
            X.Sfh r0 = r6.LJLLI
            r1.removeOnTabSelectedListener(r0)
            android.os.Bundle r1 = r6.getArguments()
            if (r1 == 0) goto L53
            java.lang.String r0 = "EDIT_TEMPLATE_FROM_CREATION"
            boolean r0 = r1.getBoolean(r0)
            r5 = 1
            if (r0 != r5) goto L53
        L26:
            X.TBE r4 = r6.LJZ
            if (r4 == 0) goto L59
            X.Seb r3 = new X.Seb
            android.content.Context r2 = r6.requireContext()
            java.lang.String r0 = "requireContext()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            androidx.fragment.app.FragmentManager r1 = r6.getChildFragmentManager()
            java.lang.String r0 = "childFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r2, r5, r1, r11)
            r4.setAdapter(r3)
            X.Vej r1 = r6.LJLZ
            if (r1 == 0) goto L55
            X.Sfh r0 = r6.LJLLI
            r1.addOnTabSelectedListener(r0)
            r6.Ll()
        L50:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L53:
            r5 = 0
            goto L26
        L55:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L59:
            java.lang.String r0 = "navi_editor_viewpager"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r8
        L5f:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72674Sfe.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
