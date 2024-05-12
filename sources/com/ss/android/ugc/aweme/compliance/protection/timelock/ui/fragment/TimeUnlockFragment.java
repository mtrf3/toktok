package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1FO;
import X.C29S;
import X.C38352F3k;
import X.C3C5;
import X.C73969T1h;
import X.C76800UCe;
import X.C78488UrE;
import X.C86305Xu1;
import X.C90903hW;
import X.EnumC62934Omw;
import X.HG3;
import X.PVC;
import X.RBX;
import X.T16;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.AfS36S0101000_5;
import Y.AfS39S0101000_13;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.zhiliaoapp.musically.R;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class TimeUnlockFragment extends AbsTimeLockFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public TextView LJLJI;
    public TuxTextView LJLJJI;
    public String LJLJJL;

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment
    public final void vl(String str) {
        String LJ;
        FamilyPiaringManager.LIZ.getClass();
        if (FamilyPiaringManager.LIZJ() == EnumC62934Omw.CHILD) {
            o.LJIIIZ(str, "<this>");
            if (str.length() != 0) {
                String childUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                if (!TextUtils.isEmpty(childUserId)) {
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(childUserId);
                        LIZ.append(':');
                        LIZ.append(str);
                        String md5Content = C38352F3k.LIZJ(X1D.LIZIZ(LIZ));
                        o.LJIIIIZZ(childUserId, "childUserId");
                        Charset charset = PVC.LIZ;
                        byte[] bytes = childUserId.getBytes(charset);
                        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
                        Mac mac = Mac.getInstance("HmacSHA256");
                        mac.init(secretKeySpec);
                        o.LJIIIIZZ(md5Content, "md5Content");
                        byte[] bytes2 = md5Content.getBytes(charset);
                        o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
                        LJ = C38352F3k.LJ(mac.doFinal(bytes2));
                    } catch (Exception unused) {
                    }
                    FamilyPairingApi.LIZ(LJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS39S0101000_13(2, this, 4), new AfS36S0101000_5(2, this, 53));
                }
            }
            LJ = "";
            FamilyPairingApi.LIZ(LJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS39S0101000_13(2, this, 4), new AfS36S0101000_5(2, this, 53));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        this.LJLJI = (TextView) view.findViewById(R.id.mrr);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.mse);
        super.onViewCreated(view, bundle);
        C78488UrE LJII = C1FO.LJII();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.LJLJJL = str;
        if (LJII != null) {
            boolean LJ = C86305Xu1.LJ();
            TextView textView = this.LJLJI;
            if (LJ) {
                if (TextUtils.equals(this.LJLJJL, "add_account")) {
                    i = R.string.bf4;
                } else if (TextUtils.equals(this.LJLJJL, "switch_account")) {
                    i = R.string.ryy;
                } else if (!((RBX) HG3.LJIILL()).isLogin()) {
                    i = R.string.qux;
                } else {
                    i = R.string.sc7;
                }
            } else {
                i = R.string.sc8;
            }
            textView.setText(getString(i));
            TuxTextView tuxTextView = this.LJLJJI;
            if (LJ) {
                i2 = R.string.sca;
            } else {
                i2 = R.string.scb;
            }
            tuxTextView.setText(getString(i2));
            this.LJLJJI.LJJJ(26.0f);
            ImageView imageView = (ImageView) view.findViewById(R.id.l82);
            imageView.setVisibility(0);
            C16880lQ.LJIILLIIL(imageView, new ACListenerS33S0100000_13(this, 101));
            return;
        }
        this.LJLJI.setText(getString(R.string.sc9, String.valueOf(C86305Xu1.LIZJ())));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agj, viewGroup, false);
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
