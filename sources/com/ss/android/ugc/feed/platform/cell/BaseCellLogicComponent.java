package com.ss.android.ugc.feed.platform.cell;

import X.C16880lQ;
import X.C207668Da;
import X.C221108m2;
import X.C37179EiV;
import X.C3C8;
import X.C62822Ol8;
import X.C73098SmU;
import X.C8MM;
import X.C8MQ;
import X.C8O4;
import X.C8XO;
import Y.ARunnableS39S0100000_3;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCellLogicComponent<RECEIVER extends C3C8> extends ReusedAssem<RECEIVER> implements C8XO<VideoItemParams>, C8MQ {
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3((BaseCellLogicComponent) this, 1234));

    @Override // X.C8MQ
    public final void B2(int i, Aweme aweme) {
    }

    @Override // X.C8MQ
    public final void E1() {
    }

    @Override // X.C8MQ
    public final void LJJIII(int i) {
    }

    @Override // X.C8MQ
    public final void LJJIJIIJIL(int i) {
    }

    @Override // X.C8MQ
    public final void LJJJJ() {
    }

    public void LLIILZL() {
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public void eventInit(C8MM c8mm) {
    }

    public void onDestroyView() {
    }

    public void unBind() {
    }

    @Override // X.C8MQ
    public final void v0(int i, Aweme aweme) {
    }

    @Override // X.C8MQ
    public final C8O4 a1() {
        return (C8O4) this.LJLLJ.getValue();
    }

    @Override // X.C8O3
    public final EventCenter getEventCenter() {
        return a1().LJFF;
    }

    @Override // X.C8W0
    public void onParentSet() {
        super.onParentSet();
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C8MM c8mm = new C8MM();
            eventInit(c8mm);
            if (!c8mm.LIZIZ().isEmpty()) {
                Set<Map.Entry<String, Observer<C207668Da>>> entrySet = c8mm.LIZIZ().entrySet();
                o.LJIIIIZZ(entrySet, "observers.entries");
                for (Map.Entry<String, Observer<C207668Da>> entry : entrySet) {
                    EventCenter eventCenter = a1().LJFF;
                    if (eventCenter != null) {
                        eventCenter.iv0(entry.getKey(), entry.getValue(), true);
                    }
                }
                return;
            }
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS39S0100000_3(this, 113));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}
