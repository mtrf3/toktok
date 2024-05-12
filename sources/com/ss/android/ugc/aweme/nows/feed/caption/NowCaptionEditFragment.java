package com.ss.android.ugc.aweme.nows.feed.caption;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C185157Ol;
import X.C185167Om;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C76800UCe;
import X.C78939UyV;
import X.C90903hW;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowCaptionEditFragment extends BaseFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final IDObjectS176S0100000_3 LJLIL = new IDObjectS176S0100000_3(this, 5);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Aweme getAweme() {
        C185157Ol c185157Ol = C185167Om.LIZ;
        if (c185157Ol != null) {
            return c185157Ol.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel urlModel;
        ColorDrawable colorDrawable;
        boolean z;
        NowPostInfo nowPostInfo;
        NowPostInfo nowPostInfo2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.aej);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 271));
        }
        SmartImageView smartImageView = (SmartImageView) _$_findCachedViewById(R.id.h70);
        if (smartImageView != null) {
            S3I s3i = new S3I();
            s3i.LIZLLL = C32151Nz.LJIIZILJ(23);
            smartImageView.setCircleOptions(new S3L(s3i));
        }
        Aweme aweme = getAweme();
        UrlModel urlModel2 = null;
        if (aweme != null && (nowPostInfo2 = aweme.nowPostInfo) != null) {
            urlModel = nowPostInfo2.getBackImage();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LIZJ = getContext();
        Context context = getContext();
        if (context != null) {
            colorDrawable = new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d1, context));
        } else {
            colorDrawable = null;
        }
        LJII.LJIILIIL = colorDrawable;
        LJII.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.h70);
        C16880lQ.LLJJJ(LJII);
        Aweme aweme2 = getAweme();
        if (aweme2 != null && aweme2.getAwemeType() == 41) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.h7v);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            SmartImageView smartImageView2 = (SmartImageView) _$_findCachedViewById(R.id.h7v);
            if (smartImageView2 != null) {
                S3I s3i2 = new S3I();
                s3i2.LIZLLL = C32151Nz.LJIIZILJ(15);
                float LJIIZILJ = C32151Nz.LJIIZILJ(2);
                s3i2.LIZJ = -16777216;
                s3i2.LIZIZ = LJIIZILJ;
                smartImageView2.setCircleOptions(new S3L(s3i2));
            }
            Aweme aweme3 = getAweme();
            if (aweme3 != null && (nowPostInfo = aweme3.nowPostInfo) != null) {
                urlModel2 = nowPostInfo.getFrontImage();
            }
            W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel2));
            LJII2.LIZJ = getContext();
            LJII2.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.h7v);
            C16880lQ.LLJJJ(LJII2);
        } else {
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.h7v);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.b4t);
        if (textView != null) {
            textView.addTextChangedListener(this.LJLIL);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.b4t);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS39S0100000_3(this, 192), 200L);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.b9q);
        if (textView2 != null) {
            Locale locale = Locale.US;
            String string = _$_findCachedViewById(R.id.b9q).getContext().getString(R.string.xm);
            o.LJIIIIZZ(string, "char_count.context.getSt…ptionCharacterCount_body)");
            String LLLZI = C16880lQ.LLLZI(locale, string, Arrays.copyOf(new Object[]{0, 80}, 2));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            textView2.setText(LLLZI);
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.jao);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 270));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bxg, viewGroup, false);
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
