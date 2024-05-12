package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.C212018Tt;
import X.C212028Tu;
import X.C214348b8;
import X.C214368bA;
import X.C30746C4w;
import X.C38995FSd;
import X.C3YP;
import X.C51029K0z;
import X.C53873LCj;
import X.C53887LCx;
import X.C57127MbT;
import X.C57128MbU;
import X.C59251NNf;
import X.C59252NNg;
import X.C59256NNk;
import X.C5H3;
import X.C65352Pkq;
import X.C73340SqO;
import X.C75792yF;
import X.C78253UnR;
import X.C78895Uxn;
import X.C7MY;
import X.C86393XvR;
import X.C9Z2;
import X.EnumC53720L6m;
import X.J7H;
import X.KL2;
import X.L5W;
import X.O6R;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC2059986p;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.ARunnableS39S0100000_3;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedAvatarLiveAssem extends FeedBaseContentAssem<FeedAvatarLiveAssem> {
    public C57127MbT LJZL;
    public C57128MbU LL;
    public C53873LCj LLD;
    public C53887LCx LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;
    public boolean LLFII;
    public SlimRoom LLFZ;
    public final AfS55S0100000_3 LLI;

    public FeedAvatarLiveAssem() {
        new LinkedHashMap();
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C212018Tt.INSTANCE);
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C212028Tu.INSTANCE);
        this.LLI = new AfS55S0100000_3(this, 27);
    }

    public final void Z3() {
        String str;
        User author;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str = author.roomData;
        } else {
            str = null;
        }
        this.LLFZ = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
        o.LJIIIIZZ(str2, "item.eventType");
        LJJIJIL.F2(C30746C4w.LIZIZ(str2, "video_head", this.LLFZ));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        boolean z;
        UrlModel urlModel;
        User author;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C9Z2 c9z2 = FeedAvatarAssemWrap.LLII;
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        c9z2.getClass();
        boolean LIZIZ = C59251NNf.LIZIZ(3, aweme);
        boolean LIZ = C9Z2.LIZ(item.getAweme());
        C57128MbU c57128MbU = this.LL;
        User user = null;
        if (c57128MbU != null) {
            if (!LIZIZ && LIZ) {
                z = true;
            } else {
                z = false;
            }
            c57128MbU.LIZIZ(z);
            Context context = getContext();
            if (context != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                FeedAvatarDefaultAssem.LLIIIL.getClass();
                LIZ2.append(FeedAvatarDefaultAssem.LLIIJI);
                LIZ2.append('_');
                LIZ2.append(item.getAweme().getAid());
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                int dimension = (int) context.getResources().getDimension(R.dimen.kb);
                Aweme aweme2 = item.getAweme();
                C57128MbU c57128MbU2 = this.LL;
                if (c57128MbU2 != null) {
                    if (C59251NNf.LJ(c57128MbU2.getAvatarImageView(), aweme2)) {
                        C78253UnR LJJIIZI = C73340SqO.LJJIIZI();
                        C59256NNk LIZJ = C59251NNf.LIZJ(item.getAweme());
                        LJJIIZI.getClass();
                        C59252NNg.LJIILJJIL(LIZJ);
                    } else {
                        C57128MbU c57128MbU3 = this.LL;
                        if (c57128MbU3 != null) {
                            C57127MbT avatarImageView = c57128MbU3.getAvatarImageView();
                            Aweme aweme3 = item.getAweme();
                            if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                                urlModel = author.getAvatarThumb();
                            } else {
                                urlModel = null;
                            }
                            avatarImageView.LJIIIIZZ(urlModel, J7H.LIZ(101), dimension, dimension, LIZIZ2, true, new L5W(item.getAweme(), item.mEventType));
                        } else {
                            o.LJIJI("avatarLiveView");
                            throw null;
                        }
                    }
                    C57128MbU c57128MbU4 = this.LL;
                    if (c57128MbU4 != null) {
                        c57128MbU4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS29S0300000_3(this, item, context, 10)));
                    } else {
                        o.LJIJI("avatarLiveView");
                        throw null;
                    }
                } else {
                    o.LJIJI("avatarLiveView");
                    throw null;
                }
            }
            C53887LCx c53887LCx = this.LLF;
            if (c53887LCx != null) {
                Aweme aweme4 = item.getAweme();
                if (aweme4 != null) {
                    user = aweme4.getAuthor();
                }
                c53887LCx.LIZIZ(user, FeedAvatarLiveAssem.class, this.LLI, item.getAweme());
                if (!LIZIZ && LIZ) {
                    Aweme aweme5 = item.getAweme();
                    if (aweme5 != null) {
                        aweme5.getAuthor();
                    }
                    if (C30746C4w.LIZ()) {
                        C38995FSd.LIZLLL().execute(new ARunnableS39S0100000_3(this, 191));
                        return;
                    } else {
                        Z3();
                        return;
                    }
                }
                return;
            }
            o.LJIJI("avatarBorderViewController");
            throw null;
        }
        o.LJIJI("avatarLiveView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LJZL = (C57127MbT) C7MY.LIZLLL(view, "view", R.id.my0, "view.findViewById(R.id.user_avatar)");
        View findViewById = view.findViewById(R.id.myc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.user_avatar_live)");
        C57128MbU c57128MbU = (C57128MbU) findViewById;
        this.LL = c57128MbU;
        c57128MbU.setBorderColor(R.color.yi);
        View findViewById2 = view.findViewById(R.id.my7);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.user_avatar_border)");
        this.LLD = (C53873LCj) findViewById2;
        Object LJIIIZ = C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_feed_live_avatar_tap_area");
        o.LJIIIIZZ(LJIIIZ, "get().getService(ILiveOu…_avatar_tap_area\", false)");
        if (((Boolean) LJIIIZ).booleanValue()) {
            C53873LCj c53873LCj = this.LLD;
            if (c53873LCj != null) {
                ViewGroup.LayoutParams layoutParams = c53873LCj.getLayoutParams();
                layoutParams.width = O6R.LJJIIZ(KL2.LIZJ(c53873LCj.getContext(), 58.0f));
                layoutParams.height = O6R.LJJIIZ(KL2.LIZJ(c53873LCj.getContext(), 58.0f));
                c53873LCj.setLayoutParams(layoutParams);
            } else {
                o.LJIJI("avatarBorderView");
                throw null;
            }
        }
        C57128MbU c57128MbU2 = this.LL;
        if (c57128MbU2 != null) {
            c57128MbU2.setOnTouchListener(new ViewOnTouchListenerC2059986p());
            C9Z2 c9z2 = FeedAvatarAssemWrap.LLII;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            c9z2.getClass();
            boolean LIZ = C9Z2.LIZ(aweme);
            C57128MbU c57128MbU3 = this.LL;
            if (c57128MbU3 != null) {
                C57127MbT c57127MbT = this.LJZL;
                if (c57127MbT != null) {
                    C53873LCj c53873LCj2 = this.LLD;
                    if (c53873LCj2 != null) {
                        this.LLF = new C53887LCx(LIZ, c57128MbU3, c57127MbT, c53873LCj2, EnumC53720L6m.FEED);
                        C57128MbU c57128MbU4 = this.LL;
                        if (c57128MbU4 != null) {
                            c57128MbU4.setVisibility(8);
                            C53873LCj c53873LCj3 = this.LLD;
                            if (c53873LCj3 != null) {
                                c53873LCj3.setVisibility(8);
                                AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, BuildConfig.VERSION_CODE);
                                if (C3YP.LIZ()) {
                                    C214368bA.LIZ().execute(new ARunnableS39S0100000_3((Object) aqS153S0100000_3, 55));
                                    return;
                                } else {
                                    aqS153S0100000_3.invoke();
                                    return;
                                }
                            }
                            o.LJIJI("avatarBorderView");
                            throw null;
                        }
                        o.LJIJI("avatarLiveView");
                        throw null;
                    }
                    o.LJIJI("avatarBorderView");
                    throw null;
                }
                o.LJIJI("avatarView");
                throw null;
            }
            o.LJIJI("avatarLiveView");
            throw null;
        }
        o.LJIJI("avatarLiveView");
        throw null;
    }
}
