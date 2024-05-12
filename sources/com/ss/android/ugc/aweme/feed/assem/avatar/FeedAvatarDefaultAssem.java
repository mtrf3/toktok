package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.AV1;
import X.C110614Vt;
import X.C16120kC;
import X.C16880lQ;
import X.C188727au;
import X.C202457x3;
import X.C2049682q;
import X.C2053083y;
import X.C208078Ep;
import X.C214348b8;
import X.C214368bA;
import X.C217628gQ;
import X.C221108m2;
import X.C225348ss;
import X.C225378sv;
import X.C225418sz;
import X.C225428t0;
import X.C225448t2;
import X.C225488t6;
import X.C225498t7;
import X.C243109gQ;
import X.C2K0;
import X.C32151Nz;
import X.C36922EeM;
import X.C3C8;
import X.C3GF;
import X.C3YP;
import X.C51029K0z;
import X.C53119Kt1;
import X.C55096Ljo;
import X.C55953Lxd;
import X.C57127MbT;
import X.C59251NNf;
import X.C59252NNg;
import X.C59256NNk;
import X.C5H3;
import X.C61328O5c;
import X.C62822Ol8;
import X.C62846OlW;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C73340SqO;
import X.C76800UCe;
import X.C77869UhF;
import X.C78253UnR;
import X.C78765Uvh;
import X.C78966Uyw;
import X.C79004UzY;
import X.C7MY;
import X.C8DY;
import X.C9Z2;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC53724L6q;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.J7H;
import X.L5W;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.SY9;
import X.TBT;
import X.V92;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC2059986p;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.ACListenerS38S0200000_3;
import Y.ALAdapterS2S0300000_3;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS7S0400000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes4.dex */
public final class FeedAvatarDefaultAssem extends FeedBaseContentAssem implements FeedDefaultAvatarAbility, InterfaceC55102Lju {
    public static final C8DY LLIIIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIZ;
    public static final String LLIIJI;
    public static final String LLIIJLIL;
    public static final String LLIIL;
    public C77869UhF LJZL;
    public TuxIconView LL;
    public ViewGroup LLD;
    public C57127MbT LLF;
    public SmartImageView LLFF;
    public ImageView LLFFF;
    public C62846OlW LLFII;
    public TuxIconView LLFZ;
    public View LLI;
    public TuxIconView LLIFFJFJJ;
    public final C5H3 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C225348ss LLIIIJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8DY] */
    static {
        TBT tbt = new TBT(FeedAvatarDefaultAssem.class, "avatarDefaultVM", "getAvatarDefaultVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarDefaultVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIZ = new InterfaceC74236TBo[]{tbt};
        LLIIIL = new Object() { // from class: X.8DY
        };
        LLIIJI = "FeedAvatarView";
        LLIIJLIL = "avatar_resize";
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        LLIIL = "send";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void AU(float f, int i, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Bs(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect K1() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false).unsubscribe(this.LLIIIJ);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1143000686) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.8ss] */
    public FeedAvatarDefaultAssem() {
        new LinkedHashMap();
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C225418sz.INSTANCE);
        C65776Prg LIZ = C65352Pkq.LIZ(FeedAvatarDefaultVM.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 289), null, C225448t2.INSTANCE, null, null);
        this.LLIIIILZ = C221108m2.LIZIZ(C225498t7.LJLIL);
        this.LLIIIJ = new InterfaceC53724L6q() { // from class: X.8ss
            @Override // X.InterfaceC53724L6q
            public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
                String str;
                Aweme aweme;
                User author;
                Aweme aweme2;
                FeedAvatarDefaultVM Z3 = FeedAvatarDefaultAssem.this.Z3();
                if (profileBadgeStruct == null) {
                    Z3.getClass();
                    return;
                }
                VideoItemParams gv0 = Z3.gv0();
                if (gv0 != null && (aweme2 = gv0.getAweme()) != null) {
                    str = aweme2.getAuthorUid();
                } else {
                    str = null;
                }
                if (!o.LJ(str, AccountService.LJIJ().LJFF().getCurUser().getUid())) {
                    return;
                }
                VideoItemParams gv02 = Z3.gv0();
                if (gv02 != null && (aweme = gv02.getAweme()) != null && (author = aweme.getAuthor()) != null) {
                    author.setProfileBadgeStruct(profileBadgeStruct);
                }
                Z3.withState(new AqS57S1100000_3(Z3.lv0(), Z3, 34));
            }
        };
    }

    public final FeedAvatarDefaultVM Z3() {
        return (FeedAvatarDefaultVM) this.LLIIII.LIZ(this, LLIIIZ[0]);
    }

    public final AppCompatImageView a4() {
        AppCompatImageView appCompatImageView;
        if (C225428t0.LIZJ) {
            appCompatImageView = this.LLIFFJFJJ;
            if (appCompatImageView == null) {
                o.LJIJI("followIconView");
                throw null;
            }
        } else {
            appCompatImageView = this.LJZL;
            if (appCompatImageView == null) {
                o.LJIJI("followView");
                throw null;
            }
        }
        return appCompatImageView;
    }

    public final VideoEventDispatchViewModel b4() {
        return (VideoEventDispatchViewModel) this.LLII.getValue();
    }

    public final void k4() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        int i = 0;
        if (((Boolean) this.LLIIIILZ.getValue()).booleanValue() && a4().getVisibility() != 0 && (((tuxIconView = this.LL) == null || tuxIconView.getVisibility() != 0) && ((tuxIconView2 = this.LLFZ) == null || tuxIconView2.getVisibility() != 0))) {
            i = (C79004UzY.LJJIJIIJI(getContext()) && C217628gQ.LIZIZ.LJFF()) ? 8 : 4;
        }
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        } else {
            o.LJIJI("followContainer");
            throw null;
        }
    }

    public final void l4() {
        User author;
        if (this.LL != null && ((Boolean) C53119Kt1.LIZJ.getValue()).booleanValue() && !C78966Uyw.LJJIJ().LIZIZ()) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2 && !AV1.LJIJ(author)) {
                C3GF imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                o.LJIIIIZZ(aweme2, "item.aweme");
                imUserService.LJIJ(aweme2, new AqS167S0100000_1(this, 41));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C36922EeM.LIZLLL(2, "assem", "default assem oncreated");
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [X.9gP, T] */
    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        int i;
        Aweme aweme;
        VideoItemParams gv0;
        Aweme aweme2;
        User author;
        VideoItemParams gv02;
        Aweme aweme3;
        AwemeRawAd awemeRawAd;
        UrlModel urlModel;
        User author2;
        User author3;
        String uid;
        int i2;
        int i3;
        AvatarDecoration LIZIZ;
        UrlModel sourceUrl;
        List<String> urlList;
        int i4;
        String str2;
        View view;
        final VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C68322mC c68322mC = new C68322mC();
        boolean z = C202457x3.LIZ;
        if (z) {
            String aid = item.getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            ?? LIZJ = C243109gQ.LIZJ(aid, "avatar");
            c68322mC.element = LIZJ;
            if (LIZJ != 0) {
                LIZJ.LIZ("FeedAvatarDefaultAssem.onBind");
            }
        }
        final Context context = getContext();
        if (context != null) {
            ViewGroup viewGroup = this.LLD;
            if (viewGroup != null) {
                h0.LJIJI(viewGroup, new C16120kC() { // from class: X.4Dk
                    @Override // X.C16120kC
                    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                        User author4;
                        String string;
                        o.LJIIIZ(host, "host");
                        o.LJIIIZ(info, "info");
                        super.onInitializeAccessibilityNodeInfo(host, info);
                        info.LJIILJJIL(Button.class.getName());
                        Context context2 = context;
                        Object[] objArr = new Object[1];
                        User author5 = item.getAweme().getAuthor();
                        if ((author5 == null || (string = author5.getNickname()) == null) && ((author4 = item.getAweme().getAuthor()) == null || (string = author4.getUid()) == null)) {
                            string = context.getString(R.string.aed);
                            o.LJIIIIZZ(string, "context.getString(R.stri…abels_forYou_unknownUser)");
                        }
                        objArr[0] = string;
                        info.LJIJ(context2.getString(R.string.a61, objArr));
                    }
                });
                if (C225488t6.LIZ && (view = this.LLI) != null) {
                    view.setEnabled(true);
                }
                a4().setVisibility(Z3().kv0());
                C77869UhF c77869UhF = this.LJZL;
                if (c77869UhF != null) {
                    c77869UhF.setProgress(0.0f);
                    C77869UhF c77869UhF2 = this.LJZL;
                    if (c77869UhF2 != null) {
                        Object[] objArr = new Object[1];
                        User author4 = item.getAweme().getAuthor();
                        if (author4 != null) {
                            str = author4.getNickname();
                        } else {
                            str = null;
                        }
                        String str3 = "";
                        if (str == null) {
                            str = "";
                        }
                        objArr[0] = str;
                        c77869UhF2.setContentDescription(context.getString(R.string.a61, objArr));
                        l4();
                        TuxIconView tuxIconView = this.LLFZ;
                        if (tuxIconView != null) {
                            FeedAvatarDefaultVM Z3 = Z3();
                            VideoItemParams gv03 = Z3.gv0();
                            if (gv03 != null && (aweme = gv03.getAweme()) != null && aweme.isAd() && (gv0 = Z3.gv0()) != null && (aweme2 = gv0.getAweme()) != null && (author = aweme2.getAuthor()) != null && author.isAdFake() && (gv02 = Z3.gv0()) != null && (aweme3 = gv02.getAweme()) != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null && awemeRawAd.getEnableIconUnderAvatar()) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            tuxIconView.setVisibility(i);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LLIIJI);
                        LIZ.append('_');
                        LIZ.append(item.getAweme().getAid());
                        String LIZIZ2 = X1D.LIZIZ(LIZ);
                        int dimension = (int) context.getResources().getDimension(R.dimen.kb);
                        Aweme aweme4 = item.getAweme();
                        C57127MbT c57127MbT = this.LLF;
                        if (c57127MbT != null) {
                            if (C59251NNf.LJ(c57127MbT, aweme4)) {
                                C78253UnR LJJIIZI = C73340SqO.LJJIIZI();
                                C59256NNk LIZJ2 = C59251NNf.LIZJ(item.getAweme());
                                LJJIIZI.getClass();
                                C59252NNg.LJIILJJIL(LIZJ2);
                            } else {
                                C57127MbT c57127MbT2 = this.LLF;
                                if (c57127MbT2 != null) {
                                    Aweme aweme5 = item.getAweme();
                                    if (aweme5 != null && (author2 = aweme5.getAuthor()) != null) {
                                        urlModel = author2.getAvatarThumb();
                                    } else {
                                        urlModel = null;
                                    }
                                    c57127MbT2.LJIIIIZZ(urlModel, J7H.LIZ(101), dimension, dimension, LIZIZ2, true, new L5W(item.getAweme(), item.mEventType));
                                } else {
                                    o.LJIJI("avatarView");
                                    throw null;
                                }
                            }
                            C57127MbT c57127MbT3 = this.LLF;
                            if (c57127MbT3 != null) {
                                String string = context.getString(R.string.acj);
                                o.LJIIIIZZ(string, "context.getString(R.stri…_forYou_btn_user_profile)");
                                User author5 = item.getAweme().getAuthor();
                                if ((author5 != null && (uid = author5.getNickname()) != null) || ((author3 = item.getAweme().getAuthor()) != null && (uid = author3.getUid()) != null)) {
                                    str3 = uid;
                                }
                                c57127MbT3.setContentDescription(C208078Ep.LIZ(string, C51029K0z.LJJIIZI(new OSZ("username", str3))));
                                C57127MbT c57127MbT4 = this.LLF;
                                if (c57127MbT4 != null) {
                                    c57127MbT4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS29S0300000_3(this, item, context, 9)));
                                    m4(Z3().lv0());
                                    ViewGroup viewGroup2 = this.LLD;
                                    if (viewGroup2 != null) {
                                        if (item.getAweme().isDelete()) {
                                            i2 = 4;
                                        } else {
                                            i2 = 0;
                                        }
                                        viewGroup2.setVisibility(i2);
                                        ImageView imageView = this.LLFFF;
                                        if (imageView != null) {
                                            C9Z2 c9z2 = FeedAvatarAssemWrap.LLII;
                                            Aweme aweme6 = item.getAweme();
                                            o.LJIIIIZZ(aweme6, "item.aweme");
                                            c9z2.getClass();
                                            if (C59251NNf.LIZIZ(3, aweme6) || !C63081OpJ.LLJLILLLLZIIL(item.getAweme())) {
                                                i3 = 8;
                                            } else {
                                                i3 = 0;
                                            }
                                            imageView.setVisibility(i3);
                                        }
                                        C62846OlW c62846OlW = this.LLFII;
                                        if (c62846OlW != null) {
                                            C9Z2 c9z22 = FeedAvatarAssemWrap.LLII;
                                            Aweme aweme7 = item.getAweme();
                                            o.LJIIIIZZ(aweme7, "item.aweme");
                                            c9z22.getClass();
                                            if (!C59251NNf.LIZIZ(3, aweme7) && !C9Z2.LIZ(item.getAweme())) {
                                                item.getAweme().getAuthor();
                                            }
                                            c62846OlW.setVisibility(8);
                                        }
                                        C62846OlW c62846OlW2 = this.LLFII;
                                        if (c62846OlW2 != null && c62846OlW2.getVisibility() == 0) {
                                            User author6 = item.getAweme().getAuthor();
                                            C62846OlW c62846OlW3 = this.LLFII;
                                            if (c62846OlW3 != null && author6 != null && (LIZIZ = C225378sv.LIZIZ(author6)) != null && (sourceUrl = LIZIZ.getSourceUrl()) != null && (urlList = sourceUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                                                V92 hierarchy = c62846OlW3.getHierarchy();
                                                if (hierarchy != null) {
                                                    i4 = 0;
                                                    hierarchy.LJIILL(new ColorDrawable(0), 1);
                                                } else {
                                                    i4 = 0;
                                                }
                                                V92 hierarchy2 = c62846OlW3.getHierarchy();
                                                if (hierarchy2 != null) {
                                                    hierarchy2.LJIILL(new ColorDrawable(i4), 5);
                                                }
                                                C78765Uvh.LJFF(c62846OlW3, sourceUrl);
                                            }
                                            User author7 = item.getAweme().getAuthor();
                                            Long LIZ2 = C225378sv.LIZ(author7);
                                            if (author7 != null) {
                                                str2 = author7.getUid();
                                            } else {
                                                str2 = null;
                                            }
                                            if (LIZ2 != null) {
                                                LIZ2.longValue();
                                                if (str2 != null) {
                                                    ArrayMap arrayMap = new ArrayMap(4);
                                                    arrayMap.put("dec_id", LIZ2.toString());
                                                    arrayMap.put("enter_from", "feed");
                                                    arrayMap.put("author_id", str2);
                                                    FMX.LJIIL("show_head_decoration", arrayMap);
                                                }
                                            }
                                        }
                                        k4();
                                        if (z) {
                                            C57127MbT c57127MbT5 = this.LLF;
                                            if (c57127MbT5 != null) {
                                                c57127MbT5.post(new ARunnableS22S0200000_3(c68322mC, this, 57));
                                                return;
                                            } else {
                                                o.LJIJI("avatarView");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    o.LJIJI("followContainer");
                                    throw null;
                                }
                                o.LJIJI("avatarView");
                                throw null;
                            }
                            o.LJIJI("avatarView");
                            throw null;
                        }
                        o.LJIJI("avatarView");
                        throw null;
                    }
                    o.LJIJI("followView");
                    throw null;
                }
                o.LJIJI("followView");
                throw null;
            }
            o.LJIJI("followContainer");
            throw null;
        }
    }

    public final void c4(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType);
        c188727au.LJIIIZ("enter_method", "head_icon");
        c188727au.LJIIIZ("event_type", str);
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        String str3 = null;
        if (aweme != null) {
            str2 = aweme.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme2 != null) {
            str3 = aweme2.getAid();
        }
        c188727au.LJIIIZ("group_id", str3);
        FMX.LJIIL("reply_friend_im", c188727au.LIZ);
    }

    public final void e4(Aweme aweme) {
        if (!((RBX) HG3.LJIILL()).isLogin() || !aweme.isCanPlay()) {
            return;
        }
        FollowStatus followStatus = new FollowStatus("", 1);
        if (C225428t0.LIZJ) {
            C77869UhF c77869UhF = this.LJZL;
            if (c77869UhF != null) {
                c77869UhF.pauseAnimation();
                Interpolator LIZ = C55953Lxd.LIZ();
                Interpolator LJII = C55953Lxd.LJII();
                TuxIconView tuxIconView = this.LLIFFJFJJ;
                if (tuxIconView != null) {
                    tuxIconView.clearAnimation();
                    ValueAnimator ofFloat = ObjectAnimator.ofFloat(1.0f, 0.5f);
                    if (ofFloat != null) {
                        ofFloat.setInterpolator(LIZ);
                        ofFloat.setDuration(100L);
                        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(this, 6));
                    } else {
                        ofFloat = null;
                    }
                    ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.5f, 1.0f);
                    if (ofFloat2 != null) {
                        ofFloat2.setInterpolator(LJII);
                        ofFloat2.setDuration(150L);
                        ofFloat2.addUpdateListener(new AUListenerS92S0100000_3(this, 8));
                    } else {
                        ofFloat2 = null;
                    }
                    ValueAnimator ofFloat3 = ObjectAnimator.ofFloat(1.0f, 0.0f);
                    if (ofFloat3 != null) {
                        ofFloat3.setInterpolator(C55953Lxd.LIZLLL());
                        ofFloat3.setDuration(200L);
                        ofFloat3.addUpdateListener(new AUListenerS92S0100000_3(this, 7));
                    } else {
                        ofFloat3 = null;
                    }
                    TuxIconView tuxIconView2 = this.LLIFFJFJJ;
                    if (tuxIconView2 != null) {
                        tuxIconView2.post(new ARunnableS22S0200000_3(ofFloat, this, 15));
                        TuxIconView tuxIconView3 = this.LLIFFJFJJ;
                        if (tuxIconView3 != null) {
                            tuxIconView3.postDelayed(new ARunnableS22S0200000_3(ofFloat2, this, 14), 100L);
                            TuxIconView tuxIconView4 = this.LLIFFJFJJ;
                            if (tuxIconView4 != null) {
                                tuxIconView4.postDelayed(new ARunnableS7S0400000_3(ofFloat3, this, aweme, followStatus, 1), 850L);
                                return;
                            } else {
                                o.LJIJI("followIconView");
                                throw null;
                            }
                        }
                        o.LJIJI("followIconView");
                        throw null;
                    }
                    o.LJIJI("followIconView");
                    throw null;
                }
                o.LJIJI("followIconView");
                throw null;
            }
            o.LJIJI("followView");
            throw null;
        }
        C77869UhF c77869UhF2 = this.LJZL;
        if (c77869UhF2 != null) {
            c77869UhF2.playAnimation();
            C77869UhF c77869UhF3 = this.LJZL;
            if (c77869UhF3 != null) {
                c77869UhF3.addAnimatorListener(new ALAdapterS2S0300000_3(this, aweme, followStatus, 0));
                return;
            } else {
                o.LJIJI("followView");
                throw null;
            }
        }
        o.LJIJI("followView");
        throw null;
    }

    public final void g4(int i) {
        a4().setVisibility(i);
        if (C225428t0.LIZJ && i == 0) {
            if (C79004UzY.LJJIJIIJI(getContext()) && C217628gQ.LIZIZ.LJFF()) {
                TuxIconView tuxIconView = this.LLIFFJFJJ;
                if (tuxIconView != null) {
                    tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                    TuxIconView tuxIconView2 = this.LLIFFJFJJ;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                        TuxIconView tuxIconView3 = this.LLIFFJFJJ;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setIconRes(R.drawable.auc);
                        } else {
                            o.LJIJI("followIconView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("followIconView");
                        throw null;
                    }
                } else {
                    o.LJIJI("followIconView");
                    throw null;
                }
            } else if (C225428t0.LIZ) {
                TuxIconView tuxIconView4 = this.LLIFFJFJJ;
                if (tuxIconView4 != null) {
                    tuxIconView4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)));
                    TuxIconView tuxIconView5 = this.LLIFFJFJJ;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)));
                        TuxIconView tuxIconView6 = this.LLIFFJFJJ;
                        if (tuxIconView6 != null) {
                            tuxIconView6.setIconRes(R.drawable.auc);
                        } else {
                            o.LJIJI("followIconView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("followIconView");
                        throw null;
                    }
                } else {
                    o.LJIJI("followIconView");
                    throw null;
                }
            } else {
                TuxIconView tuxIconView7 = this.LLIFFJFJJ;
                if (tuxIconView7 != null) {
                    tuxIconView7.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
                    TuxIconView tuxIconView8 = this.LLIFFJFJJ;
                    if (tuxIconView8 != null) {
                        tuxIconView8.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                        TuxIconView tuxIconView9 = this.LLIFFJFJJ;
                        if (tuxIconView9 != null) {
                            tuxIconView9.setIconRes(R.drawable.aub);
                        } else {
                            o.LJIJI("followIconView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("followIconView");
                        throw null;
                    }
                } else {
                    o.LJIJI("followIconView");
                    throw null;
                }
            }
            TuxIconView tuxIconView10 = this.LLIFFJFJJ;
            if (tuxIconView10 != null) {
                tuxIconView10.setScaleX(1.0f);
                TuxIconView tuxIconView11 = this.LLIFFJFJJ;
                if (tuxIconView11 != null) {
                    tuxIconView11.setScaleY(1.0f);
                    return;
                } else {
                    o.LJIJI("followIconView");
                    throw null;
                }
            }
            o.LJIJI("followIconView");
            throw null;
        }
    }

    public final void m4(String str) {
        int i;
        Object obj;
        SmartImageView smartImageView = this.LLFF;
        if (smartImageView != null) {
            if (str == null || str.length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            smartImageView.setVisibility(i);
        }
        if (str == null || str.length() == 0) {
            return;
        }
        if (this.LLFF != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = this.LLFF;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthor().getSecUid());
        ProfileBadgeStruct profileBadge = aweme.getAuthor().getProfileBadge();
        if (profileBadge == null || (obj = profileBadge.getId()) == null) {
            obj = "";
        }
        c188727au.LJFF(obj, "badge_id");
        c188727au.LJIIIZ("enter_from", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType);
        FMX.LJIIL("profile_badge_show", c188727au.LIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        Context context;
        o.LJIIIZ(view, "view");
        C36922EeM.LIZLLL(2, "assem", "default assem onViewCreated");
        this.LLI = view;
        if (C225488t6.LIZ) {
            view.setEnabled(false);
        }
        View findViewById = view.findViewById(R.id.dke);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.follow_icon)");
        this.LLIFFJFJJ = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.djm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.follow)");
        C77869UhF c77869UhF = (C77869UhF) findViewById2;
        this.LJZL = c77869UhF;
        c77869UhF.setAnimation("common_feed_anim_follow_people.json");
        if (C225428t0.LIZJ) {
            TuxIconView tuxIconView = this.LLIFFJFJJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                C77869UhF c77869UhF2 = this.LJZL;
                if (c77869UhF2 != null) {
                    c77869UhF2.setVisibility(8);
                } else {
                    o.LJIJI("followView");
                    throw null;
                }
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.ce1);
        this.LL = tuxIconView2;
        if (tuxIconView2 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            tuxIconView2.setBackground(c110614Vt.LIZ(context2));
        }
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.ccg);
        this.LLFZ = tuxIconView3;
        if (tuxIconView3 != null) {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cl);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(22);
            Context context3 = view.getContext();
            o.LJIIIIZZ(context3, "view.context");
            tuxIconView3.setBackground(c110614Vt2.LIZ(context3));
        }
        View findViewById3 = view.findViewById(R.id.dk7);
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        if (e1.LIZ(31744, "home_ui_optimize_follow_clickable_area", true, false)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = C7MY.LIZIZ(40);
            viewGroup.setLayoutParams(layoutParams);
        }
        C16880lQ.LJIIL(viewGroup, new ACListenerS38S0200000_3(this, view, 31));
        o.LJIIIIZZ(findViewById3, "view.findViewById<ViewGr…}\n            }\n        }");
        this.LLD = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(R.id.my0);
        findViewById4.setOnTouchListener(new ViewOnTouchListenerC2059986p());
        o.LJIIIIZZ(findViewById4, "view.findViewById<SmartA…er(0.5f, 1.0f))\n        }");
        C57127MbT c57127MbT = (C57127MbT) findViewById4;
        this.LLF = c57127MbT;
        c57127MbT.setBorderColor(R.color.ar);
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (C2049682q.LIZ(aweme) && (context = getContext()) != null) {
            C57127MbT c57127MbT2 = this.LLF;
            if (c57127MbT2 != null) {
                c57127MbT2.setPlaceholderImage(new SY9(context, R.raw.icon_color_default_avatar));
            } else {
                o.LJIJI("avatarView");
                throw null;
            }
        }
        this.LLFF = (SmartImageView) view.findViewById(R.id.i_k);
        this.LLFFF = (ImageView) view.findViewById(R.id.f2z);
        this.LLFII = (C62846OlW) view.findViewById(R.id.abw);
        ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false).subscribe(this.LLIIIJ);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 288);
        if (C3YP.LIZ()) {
            C214368bA.LIZ().execute(new ARunnableS39S0100000_3((Object) aqS153S0100000_3, 54));
        } else {
            aqS153S0100000_3.invoke();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("default assem onViewCreated end: ");
        LIZ.append(this.LLFF);
        C36922EeM.LIZLLL(2, "assem", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    public final void n4(Aweme aweme, FollowStatus followStatus) {
        C77869UhF c77869UhF = this.LJZL;
        if (c77869UhF != null) {
            c77869UhF.postDelayed(new ARunnableS12S0300000_1(aweme, followStatus, this, 2), 850L);
        } else {
            o.LJIJI("followView");
            throw null;
        }
    }
}
