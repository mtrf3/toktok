package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240639cR;
import X.C240719cZ;
import X.C8XO;
import X.EnumC240399c3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultThirdLineAssem extends ReusedUISlotAssem<DefaultThirdLineAssem> implements C8XO<C240719cZ> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6o;
    }

    public void m4(EnumC240399c3 enumC240399c3, MusicModel musicModel, boolean z) {
        throw null;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultThirdLineAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        m4(c240639cR.LJLIL, item.LJLIL, c240639cR.LJLILLLLZI);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.gre);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
