package com.ss.android.ugc.aweme.music.ui.widget;

import X.C06490Nh;
import X.C62189Oav;
import X.C63058Oow;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ThirdMusicViewHolder extends PowerCell<C63058Oow> {
    public C62189Oav LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;
    public View LJLJJI;
    public Animation LJLJJL;

    public final void L() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.clearAnimation();
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            } else {
                o.LJIJI("loading");
                throw null;
            }
        }
        o.LJIJI("loading");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C63058Oow r10) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.but, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.f8r);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_play_full_song_icon)");
        this.LJLIL = (C62189Oav) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.f8s);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_play_full_song_loading)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.f8t);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_play_full_song_text)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.ngi);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.vw_line_divider)");
        this.LJLJJI = findViewById4;
        Animation loadAnimation = AnimationUtils.loadAnimation(viewGroup.getContext(), R.anim.e5);
        o.LJIIIIZZ(loadAnimation, "loadAnimation(parent.con…t, R.anim.loading_rotate)");
        this.LJLJJL = loadAnimation;
        return LIZIZ;
    }
}
