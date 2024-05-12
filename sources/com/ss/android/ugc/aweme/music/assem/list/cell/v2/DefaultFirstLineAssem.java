package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240719cZ;
import X.C8XO;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultFirstLineAssem extends ReusedUISlotAssem<DefaultFirstLineAssem> implements C8XO<C240719cZ> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.c6a;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultFirstLineAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void F0(C240719cZ item) {
        String str;
        o.LJIIIZ(item, "item");
        MusicModel musicModel = item.LJLIL;
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView != null) {
            if (!TextUtils.isEmpty(musicModel.getName())) {
                str = musicModel.getName();
            } else {
                str = "";
            }
            tuxTextView.setText(str);
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.gqx);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
