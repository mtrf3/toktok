package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240719cZ;
import X.C32151Nz;
import X.C62846OlW;
import X.C78765Uvh;
import X.C8XO;
import X.C99W;
import X.OUP;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultCoverAssem extends ReusedUISlotAssem<DefaultCoverAssem> implements C8XO<C240719cZ> {
    public C62846OlW LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.c68;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultCoverAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void F0(C240719cZ item) {
        o.LJIIIZ(item, "item");
        MusicModel musicModel = item.LJLIL;
        C62846OlW c62846OlW = this.LLFF;
        if (c62846OlW != null) {
            if (C99W.LIZ) {
                OUP.LJJJJLI(c62846OlW, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                C78765Uvh.LJIIIZ(c62846OlW, musicModel.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                C78765Uvh.LJIIIZ(c62846OlW, musicModel.getPicBig(), -1, -1);
            } else {
                C78765Uvh.LIZ(c62846OlW, R.drawable.bxu);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (C62846OlW) view.findViewById(R.id.gqt);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
