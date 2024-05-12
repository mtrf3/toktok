package com.ss.android.ugc.aweme.im.sdk.chat.feature.remindusers.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C101573yj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C41129GCf;
import X.C48841JEv;
import X.C61328O5c;
import X.C76800UCe;
import X.C78613UtF;
import X.C78939UyV;
import X.C89093eb;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC61213O0r;
import X.S3I;
import X.S3L;
import X.SY4;
import X.T2R;
import X.W5F;
import X.W5U;
import X.XKX;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class ChatRequestFragment extends BaseFragment {
    public int LJLIL;
    public UrlModel LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public boolean LJLJI = true;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LJLJI) {
            C101573yj.LIZJ(C101573yj.LIZ, this.LJLIL, 1, 4);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(C41129GCf.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            X.GCe r0 = X.C41128GCe.LJLIL
            r9.fragmentConfiguration(r0)
            android.os.Bundle r0 = r9.getArguments()
            r6 = 0
            if (r0 == 0) goto L9c
            int r0 = r0.size()
        L13:
            r5 = 1
            r4 = 0
            if (r0 <= 0) goto L78
            android.os.Bundle r8 = r9.getArguments()
        L1b:
            if (r8 == 0) goto L9a
            java.lang.String r0 = "permission"
            java.lang.String r0 = r8.getString(r0)
            if (r0 == 0) goto L9a
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)
            if (r0 == 0) goto L9a
            int r7 = r0.intValue()
        L2f:
            r9.LJLIL = r7
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r0 = com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl.LJIIIIZZ()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = r0.getPrivacyUserSettings()
            if (r1 == 0) goto L50
            java.lang.String r0 = "direct_message"
            java.lang.Integer r0 = r1.M(r0)
            if (r0 == 0) goto L50
            int r3 = r0.intValue()
            r2 = 2
            r1 = 4
            if (r3 == r2) goto L73
            r0 = 3
            if (r3 == r0) goto L6c
            if (r3 == r1) goto L69
        L50:
            r9.LJLJI = r6
            X.AX6.LIZ(r9)
        L55:
            if (r8 == 0) goto L67
            java.lang.String r0 = "avatar_image_url"
            java.io.Serializable r1 = r8.getSerializable(r0)
        L5d:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.model.UrlModel
            if (r0 == 0) goto L64
            r4 = r1
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = (com.ss.android.ugc.aweme.base.model.UrlModel) r4
        L64:
            r9.LJLILLLLZI = r4
            return
        L67:
            r1 = r4
            goto L5d
        L69:
            if (r7 != r5) goto L50
            goto L55
        L6c:
            if (r7 == r5) goto L55
            if (r7 == r2) goto L55
            if (r7 == r1) goto L55
            goto L50
        L73:
            if (r7 == r5) goto L55
            if (r7 == r1) goto L55
            goto L50
        L78:
            X.1qj r0 = r9.mo49getActivity()
            if (r0 == 0) goto L97
            android.content.Intent r0 = r0.getIntent()
        L82:
            boolean r1 = com.bytedance.router.SmartIntent.isSmartIntent(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L90
            if (r0 == 0) goto L90
            android.content.Intent r0 = com.bytedance.router.SmartIntent.smartIntent(r0)
        L90:
            if (r0 == 0) goto L99
            android.os.Bundle r8 = X.C16880lQ.LLJJIJI(r0)
            goto L1b
        L97:
            r0 = r4
            goto L82
        L99:
            r8 = r4
        L9a:
            r7 = 0
            goto L2f
        L9c:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.remindusers.ui.ChatRequestFragment.onCreate(android.os.Bundle):void");
    }

    public final void vl(int i) {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI())), null, null, new C89093eb(i, this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwf);
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS151S0100000_1(this, 1021));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            String string = getString(R.string.esk);
            o.LJIIIIZZ(string, "getString(R.string.dm_receiver_v4_panel_topHeader)");
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            c252709vu.setNavActions(c235119Kp);
        }
        ((TextView) _$_findCachedViewById(R.id.i4a)).setText(getString(R.string.esf));
        int i = this.LJLIL;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    ((TextView) _$_findCachedViewById(R.id.an6)).setText(getString(R.string.esg));
                    ((TextView) _$_findCachedViewById(R.id.an9)).setText(getString(R.string.esh));
                    ((TextView) _$_findCachedViewById(R.id.anb)).setText(getString(R.string.esi));
                    ((TextView) _$_findCachedViewById(R.id.b8u)).setText(getString(R.string.esj));
                }
            } else {
                ((TextView) _$_findCachedViewById(R.id.an6)).setText(getString(R.string.esb));
                ((TextView) _$_findCachedViewById(R.id.an9)).setText(getString(R.string.esc));
                ((TextView) _$_findCachedViewById(R.id.anb)).setText(getString(R.string.esd));
                ((TextView) _$_findCachedViewById(R.id.b8u)).setText(getString(R.string.ese));
            }
        } else {
            ((TextView) _$_findCachedViewById(R.id.an6)).setText(getString(R.string.es8));
            ((TextView) _$_findCachedViewById(R.id.an9)).setText(getString(R.string.es9));
            ((TextView) _$_findCachedViewById(R.id.anb)).setText(getString(R.string.es_));
            ((TextView) _$_findCachedViewById(R.id.b8u)).setText(getString(R.string.esa));
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.b8u);
        if (sy4 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context = sy4.getContext();
            o.LJIIIIZZ(context, "context");
            sy4.setBackground(c110614Vt.LIZ(context));
            C16880lQ.LJJIZ(sy4, new ACListenerS36S0200000_1(this, sy4, 82));
        }
        SmartImageView smartImageView = (SmartImageView) _$_findCachedViewById(R.id.abh);
        if (smartImageView != null) {
            S3I s3i = new S3I();
            s3i.LIZ = false;
            smartImageView.setCircleOptions(new S3L(s3i));
            UrlModel urlModel = this.LJLILLLLZI;
            if (urlModel != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJII);
            }
        }
        vl(1);
        C101573yj.LIZJ(C101573yj.LIZ, this.LJLIL, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b0t, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
