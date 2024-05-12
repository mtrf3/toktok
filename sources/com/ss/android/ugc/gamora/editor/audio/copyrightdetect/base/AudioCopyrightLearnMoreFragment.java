package com.ss.android.ugc.gamora.editor.audio.copyrightdetect.base;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78929UyL;
import X.C90903hW;
import X.InterfaceC219588ja;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioCopyrightLearnMoreFragment extends BaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Context LJLIL;
    public final PreCheckResult LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS152S0100000_2(this, 327));
        c235119Kp.LIZLLL(LIZJ);
        return c235119Kp;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String quantityString;
        String string;
        String string2;
        String string3;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.e3j)).setText(this.LJLIL.getResources().getQuantityString(R.plurals.ru, this.LJLJJI));
        TextView textView = (TextView) view.findViewById(R.id.c85);
        if (this.LJLJI) {
            quantityString = this.LJLIL.getResources().getQuantityString(R.plurals.rv, this.LJLJJI);
        } else {
            quantityString = this.LJLIL.getResources().getQuantityString(R.plurals.rw, this.LJLJJI);
        }
        textView.setText(quantityString);
        TextView textView2 = (TextView) view.findViewById(R.id.c86);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.LJLJI) {
            string = this.LJLIL.getString(R.string.q0m);
        } else {
            string = this.LJLIL.getString(R.string.q0p);
        }
        spannableStringBuilder.append((CharSequence) string).append((CharSequence) "\n\n");
        if (this.LJLJI) {
            string2 = this.LJLIL.getString(R.string.q0n);
        } else {
            string2 = this.LJLIL.getString(R.string.q0q);
        }
        spannableStringBuilder.append((CharSequence) string2).append((CharSequence) "\n\n");
        if (this.LJLJI) {
            string3 = this.LJLIL.getString(R.string.q0o);
        } else {
            string3 = this.LJLIL.getString(R.string.q0r);
        }
        spannableStringBuilder.append((CharSequence) string3);
        textView2.setText(spannableStringBuilder);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.c6x);
        Iterator<MatchDetailsV1> it = this.LJLILLLLZI.matchDetailsV1.iterator();
        while (it.hasNext()) {
            MatchDetailsV1 next = it.next();
            SongInfo songInfo = next.matchSongInfo;
            if (songInfo == null || (str = songInfo.name) == null) {
                str = "";
            }
            ArrayList<MatchPeriod> arrayList = next.matchPeriods;
            if (arrayList != null) {
                Iterator<MatchPeriod> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MatchPeriod next2 = it2.next();
                    String LJIIIZ = C78929UyL.LJIIIZ(((int) next2.startOffset) * 1000);
                    String LJIIIZ2 = C78929UyL.LJIIIZ((((int) next2.startOffset) + ((int) next2.matchDuration)) * 1000);
                    TuxTextView tuxTextView = new TuxTextView(this.LJLIL, null, 6, 0);
                    tuxTextView.setText(this.LJLIL.getString(R.string.q0k, str, LJIIIZ, LJIIIZ2));
                    tuxTextView.setTuxFont(42);
                    viewGroup.addView(tuxTextView);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.am9, viewGroup, false);
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

    public AudioCopyrightLearnMoreFragment(Context context, PreCheckResult preCheckResult, boolean z, int i) {
        this.LJLIL = context;
        this.LJLILLLLZI = preCheckResult;
        this.LJLJI = z;
        this.LJLJJI = i;
    }
}
