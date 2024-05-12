package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240719cZ;
import X.C8XO;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultSecondLineAssem extends ReusedUISlotAssem<DefaultSecondLineAssem> implements C8XO<C240719cZ> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6l;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultSecondLineAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        m4(item.LJLIL);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    public void m4(MusicModel model) {
        String str;
        o.LJIIIZ(model, "model");
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.jdo, Integer.valueOf(model.getUserCount()));
        } else {
            str = null;
        }
        tuxTextView.setText(str);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.gr8);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
