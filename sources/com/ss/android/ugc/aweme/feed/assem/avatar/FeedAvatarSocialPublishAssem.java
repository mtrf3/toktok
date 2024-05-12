package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.C212038Tv;
import X.C212048Tw;
import X.C214348b8;
import X.C214368bA;
import X.C221108m2;
import X.C3YP;
import X.C53691L5j;
import X.C54838Lfe;
import X.C57127MbT;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7MY;
import X.InterfaceC100393wp;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedAvatarSocialPublishAssem extends FeedBaseContentAssem<FeedAvatarSocialPublishAssem> {
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final C62822Ol8 LLD;
    public C53691L5j LLF;
    public C57127MbT LLFF;
    public boolean LLFFF;
    public boolean LLFII;

    public FeedAvatarSocialPublishAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C212038Tv.INSTANCE);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C212048Tw.INSTANCE);
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 292));
    }

    @Override // X.C8XO
    /* renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (C54838Lfe.LJIIZILJ(item.getAweme())) {
            InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LLD.getValue();
            if (interfaceC100393wp != null) {
                interfaceC100393wp.reset();
                return;
            }
            return;
        }
        InterfaceC100393wp interfaceC100393wp2 = (InterfaceC100393wp) this.LLD.getValue();
        if (interfaceC100393wp2 == null) {
            return;
        }
        interfaceC100393wp2.LJI(item.getAweme().getAuthor());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLF = (C53691L5j) C7MY.LIZLLL(view, "view", R.id.dfe, "view.findViewById(R.id.fl_now_avatar)");
        View findViewById = view.findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.user_avatar)");
        this.LLFF = (C57127MbT) findViewById;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 291);
        if (C3YP.LIZ()) {
            C214368bA.LIZ().execute(new ARunnableS39S0100000_3((Object) aqS153S0100000_3, 56));
        } else {
            aqS153S0100000_3.invoke();
        }
    }
}
