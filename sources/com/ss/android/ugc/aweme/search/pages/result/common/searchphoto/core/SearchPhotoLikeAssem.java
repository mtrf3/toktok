package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C05040Hs;
import X.C2068389v;
import X.C214348b8;
import X.C26338AVi;
import X.C5H3;
import X.C65352Pkq;
import X.C77123UOp;
import X.C7MY;
import X.C8FR;
import X.C8XO;
import X.C8YN;
import X.C94V;
import X.C94W;
import X.C97I;
import X.C97N;
import X.JKM;
import X.TBT;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchPhotoLikeAssem extends ReusedUIContentAssem<SearchPhotoLikeAssem> implements C8XO<JKM> {
    public final C5H3 LJZL;
    public TuxTextView LL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchPhotoLikeAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchPhotoViewModel.class), C94W.INSTANCE);
    }

    @Override // X.C8XO
    public final void F0(JKM jkm) {
        JKM item = jkm;
        o.LJIIIZ(item, "item");
        TuxTextView tuxTextView = this.LL;
        Long l = null;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            Integer valueOf = Integer.valueOf(item.LJLIL.getUserDigg());
            AwemeStatistics statistics = item.LJLIL.getStatistics();
            if (statistics != null) {
                l = Long.valueOf(statistics.getDiggCount());
            }
            Z3(new C97I(valueOf, l));
            return;
        }
        o.LJIJI("txtLikeCount");
        throw null;
    }

    public final void Z3(C97I c97i) {
        int i;
        int i2;
        Integer valueOf;
        long j;
        SpannableStringBuilder spannableStringBuilder;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Integer num = c97i.LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C2068389v c2068389v = new C2068389v();
        if (i == 1) {
            i2 = R.raw.icon_like_fill;
        } else {
            C97N.LIZ.getClass();
            if (C97N.LIZ()) {
                i2 = R.raw.icon_like;
            } else {
                i2 = R.raw.icon_like_bold;
            }
        }
        c2068389v.LIZ = i2;
        if (i == 1) {
            valueOf = Integer.valueOf(R.attr.eb);
        } else {
            valueOf = Integer.valueOf(R.attr.gv);
        }
        c2068389v.LJ = valueOf;
        float f = 14;
        c2068389v.LIZJ = C05040Hs.LIZ(1, f);
        c2068389v.LIZIZ = C05040Hs.LIZ(1, f);
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        Long l = c97i.LIZIZ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        o.LJIIIIZZ(LJJIIJ, "getDisplayCount(likeCount)");
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            if (C26338AVi.LIZLLL(tuxTextView)) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LJJIIJ);
                spannableStringBuilder.append((CharSequence) "x");
                spannableStringBuilder.setSpan(LIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "x");
                spannableStringBuilder.setSpan(LIZIZ, 0, 1, 17);
                spannableStringBuilder.append((CharSequence) LJJIIJ);
            }
            tuxTextView.setText(spannableStringBuilder);
            return;
        }
        o.LJIJI("txtLikeCount");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JKM jkm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LL = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.fqv, "view.findViewById(R.id.like_and_play_count)");
        C97N.LIZ.getClass();
        if (C97N.LIZ()) {
            TuxTextView tuxTextView = this.LL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(61);
            } else {
                o.LJIJI("txtLikeCount");
                throw null;
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJZL.getValue(), new TBT() { // from class: X.94U
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94S) obj).LJLJI;
            }
        }, null, C94V.LJLIL, 6);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JKM jkm) {
    }
}
