package com.ss.android.ugc.aweme.topicfeed.ui.tab;

import X.C16880lQ;
import X.C1DH;
import X.C53774L8o;
import X.C53805L9t;
import X.C53806L9u;
import X.EnumC53763L8d;
import X.InterfaceC53908LDs;
import X.InterfaceC65784Pro;
import X.KMP;
import X.LCY;
import X.RBY;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import defpackage.t1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseTopicTabProtocol extends TopTabProtocol {
    public final int LJLJJI;
    public final Class<? extends Fragment> LJLJJL;
    public final String LJLJJLL;
    public final EnumC53763L8d LJLJL = EnumC53763L8d.X_TAB;
    public final int LJLJLJ;
    public final String LJLJLLL;
    public WeakReference<InterfaceC53908LDs> LJLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new C53806L9u(this);
    }

    public final TopicFeedTabConfig LJIIJJI() {
        C53774L8o c53774L8o = C53774L8o.LIZ;
        int i = this.LJLJJI;
        c53774L8o.getClass();
        return C53774L8o.LIZIZ(i);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        return t1.LJI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF.isLogin() && !LJFF.isChildrenMode() && LJIIJJI().LJLIL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TOPIC_TAB_INDEX", this.LJLJJI);
        bundle.putInt("EXTRA_TOPIC_FEED_ID", LJIIJJI().topicFeedId);
        bundle.putString("EXTRA_TOPIC_WATCHED_ALL_STRING", LJIIJJI().watchedAllString);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LJLJLJ);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", this.LJLJLLL);
        bundle.putString("EXTRA_TOPIC_TAB_HOX_TAG", this.LJLJJLL);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Topic");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        return LJIIJJI().title;
    }

    public BaseTopicTabProtocol(int i, Class<? extends Fragment> cls) {
        this.LJLJJI = i;
        this.LJLJJL = cls;
        this.LJLJJLL = KMP.LJ("Topic", i);
        this.LJLJLJ = i + 50;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("homepage_topic_");
        LIZ.append(LJIIJJI().eventTrackingName);
        this.LJLJLLL = X1D.LIZIZ(LIZ);
        this.LJLL = new WeakReference<>(null);
        C53805L9t c53805L9t = new C53805L9t(this);
        C53774L8o.LIZ.getClass();
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(c53805L9t, 1000);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            aqS159S0100000_9.invoke();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS45S0100000_9((InterfaceC65784Pro) aqS159S0100000_9, 218));
        }
    }
}
