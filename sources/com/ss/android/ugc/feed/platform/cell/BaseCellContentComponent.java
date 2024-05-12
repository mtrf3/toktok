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
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCellContentComponent<RECEIVER extends C3C8> extends ReusedUIContentAssem<RECEIVER> implements C8XO<VideoItemParams>, C8MQ {
    public final C62822Ol8 LJZL;

    public void B2(int i, Aweme aweme) {
    }

    public void E1() {
    }

    public void LJJIII(int i) {
    }

    public void LJJIJIIJIL(int i) {
    }

    public void LJJJJ() {
    }

    public void LLIILZL() {
    }

    public void LLLZIIL() {
    }

    @Override // X.C8XO
    /* renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: a4, reason: merged with bridge method [inline-methods] */
    public void n3(VideoItemParams videoItemParams) {
    }

    public void eventInit(C8MM c8mm) {
    }

    public void onDestroyView() {
    }

    public void unBind() {
    }

    public void v0(int i, Aweme aweme) {
    }

    public BaseCellContentComponent() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS153S0100000_3((BaseCellContentComponent) this, 1233));
    }

    @Override // X.C8MQ
    public final C8O4 a1() {
        return (C8O4) this.LJZL.getValue();
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
        C37179EiV.LIZ().post(new ARunnableS39S0100000_3(this, 112));
    }
}
