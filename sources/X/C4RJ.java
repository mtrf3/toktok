package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4RJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RJ extends AnonymousClass460<ShareLiveContent> implements C4RQ {
    public final LinearLayout LLIIIL;
    public final C62846OlW LLIIIZ;
    public final TextView LLIIJI;
    public final TextView LLIIJLIL;
    public final SmartImageView LLIIL;
    public final TextView LLIILII;
    public final ImageView LLIILZL;
    public final View LLIIZ;
    public final TextView LLIL;
    public final ViewGroup LLILII;
    public final C62846OlW LLILIL;
    public final TextView LLILL;
    public final ViewGroup LLILLIZIL;
    public final TextView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C62846OlW LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final ObjectAnimator LLJI;
    public final C4RK LLJIJIL;
    public java.util.Set<Long> LLJILJIL;
    public java.util.Map<String, Boolean> LLJILJILJ;
    public java.util.Map<String, Boolean> LLJILLL;
    public HashMap<String, Boolean> LLJJ;
    public java.util.Map<String, Boolean> LLJJI;
    public HashMap<String, NewLiveRoomStruct> LLJJIII;
    public Drawable LLJJIJI;
    public C84763Ui LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;
    public final EventLiveData<RelationStatus> LLJJJIL;
    public final C62822Ol8 LLJJJJ;

    public final void B0() {
        z0(true);
        this.LLJ.setVisibility(8);
        this.LLJI.cancel();
        this.LLILLIZIL.setVisibility(0);
        this.LLILII.setVisibility(0);
        this.LLILLL.setVisibility(8);
        this.LLIILII.setVisibility(8);
        this.LLIZLLLIL.setVisibility(8);
    }

    @Override // X.AbstractC1041546x
    public final boolean Y() {
        return true;
    }

    @Override // X.C4RQ
    public final void LJLJJLL() {
        w0(this.LJZI);
    }

    @Override // X.C4RQ
    public final String LLLLZLLLI() {
        ShareLiveContent shareLiveContent;
        CONTENT content = this.LLIIIILZ;
        if (content == 0 || (shareLiveContent = (ShareLiveContent) content) == null) {
            return null;
        }
        return shareLiveContent.getRoomOwnerId();
    }

    @Override // X.C4RQ
    public final String LLLZZIL() {
        ShareLiveContent shareLiveContent;
        CONTENT content = this.LLIIIILZ;
        if (content == 0 || (shareLiveContent = (ShareLiveContent) content) == null) {
            return null;
        }
        return shareLiveContent.getRoomSecOwnerId();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0() {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.LLIL
            r7 = 8
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r9.LLILII
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r9.LLILLL
            r6 = 0
            r0.setVisibility(r6)
            android.widget.TextView r0 = r9.LLIILII
            r0.setVisibility(r7)
            android.widget.TextView r4 = r9.LLILZIL
            android.view.View r0 = r9.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r3 = r0.getResources()
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r0
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.getRoomOwnerName()
            if (r0 != 0) goto L34
        L32:
            java.lang.String r0 = ""
        L34:
            r1[r6] = r0
            r0 = 2131831129(0x7f112959, float:1.9295275E38)
            java.lang.String r0 = r3.getString(r0, r1)
            r4.setText(r0)
            android.view.View r0 = r9.LLIZLLLIL
            r0.setVisibility(r7)
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LLIIL
            r0.setVisibility(r6)
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r0
            r3 = 0
            if (r0 == 0) goto Led
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r0.getRoomOwnerAvatar()
        L55:
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r0
            if (r0 == 0) goto Lea
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r0.getRoomCover()
        L5f:
            r9.t0(r5, r2)
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r8 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r8 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r8
            if (r8 != 0) goto Lb3
        L68:
            android.widget.TextView r0 = r9.LLILZLL
            r0.setVisibility(r7)
            android.widget.TextView r0 = r9.LLIZ
            r0.setVisibility(r6)
        L72:
            if (r4 != 0) goto L75
            r4 = r5
        L75:
            X.OlW r1 = r9.LLILZ
            r0 = 2131233395(0x7f080a73, float:1.8082926E38)
            v0(r1, r4, r0)
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r0
            if (r0 == 0) goto Lb1
            java.lang.String r4 = r0.getRoomOwnerId()
        L87:
            CONTENT extends com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r9.LLIIIILZ
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent) r0
            if (r0 == 0) goto L91
            java.lang.String r3 = r0.getRoomSecOwnerId()
        L91:
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = X.C80533Eb.LJFF(r4, r3)
            X.3Eb r0 = X.C80533Eb.LIZ
            r0.getClass()
            java.util.Set r0 = X.C80533Eb.LIZJ()
            boolean r0 = X.ORZ.LJLJJI(r4, r0)
            r1 = r0 ^ 1
            if (r2 == 0) goto La8
            if (r1 == 0) goto Lb0
        La8:
            X.4RL r0 = new X.4RL
            r0.<init>()
            X.C80533Eb.LJIIJJI(r4, r3, r1, r0)
        Lb0:
            return
        Lb1:
            r4 = r3
            goto L87
        Lb3:
            java.lang.String r1 = r8.getRoomOwnerId()
            java.lang.String r0 = r8.getRoomSecOwnerId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = X.C80533Eb.LJIIJ(r1, r0)
            if (r0 == 0) goto Le8
            int r2 = r0.getFollowStatus()
        Lc5:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r6)
            if (r0 == 0) goto Le6
            java.lang.String r1 = r8.getRoomOwnerId()
            java.lang.String r0 = r0.getCurrentUserID()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
        Ld7:
            if (r2 != 0) goto L68
            if (r0 != 0) goto L68
            android.widget.TextView r0 = r9.LLILZLL
            r0.setVisibility(r6)
            android.widget.TextView r0 = r9.LLIZ
            r0.setVisibility(r7)
            goto L72
        Le6:
            r0 = 0
            goto Ld7
        Le8:
            r2 = 0
            goto Lc5
        Lea:
            r5 = r3
            goto L5f
        Led:
            r4 = r3
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4RJ.x0():void");
    }

    @Override // X.AbstractC1041546x
    public final void LJJJJIZL() {
        super.LJJJJIZL();
        z0(false);
        this.LLJI.cancel();
        this.LLJJIJIL = true;
        this.LLJJJIL.removeObserver((Observer) this.LLJJJJ.getValue());
    }

    public final void A0(View view) {
        String str;
        String str2;
        int id = view.getId();
        if (id == R.id.mti) {
            str = "follow";
        } else if (id == R.id.mtk) {
            str = "more_video";
        } else {
            str = "others";
        }
        C188727au c188727au = new C188727au();
        C109544Rq c109544Rq = this.LJZI;
        if (c109544Rq != null) {
            c188727au.LJ(c109544Rq.getSender(), "from_user_id");
        }
        ShareLiveContent shareLiveContent = (ShareLiveContent) this.LLIIIILZ;
        if (shareLiveContent != null) {
            str2 = shareLiveContent.getSharedEnterFrom();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "stream_goal")) {
            str = "stream_goal";
        }
        c188727au.LJI("button_type", str);
        new AqS151S0100000_1(c188727au, 813).invoke();
    }

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        this.LLILLIZIL.setClickable(true);
        C16880lQ.LJIJI(this.LLIIJLIL, onClickListener);
        C16880lQ.LJJJJJL(this.LLIIIZ, onClickListener);
        C16880lQ.LJIJI(this.LLIIJI, onClickListener);
        ACListenerS36S0200000_1 aCListenerS36S0200000_1 = new ACListenerS36S0200000_1(this, onClickListener, 30);
        C16880lQ.LJIJI(this.LLILZLL, aCListenerS36S0200000_1);
        C16880lQ.LJIJI(this.LLIZ, aCListenerS36S0200000_1);
        C16880lQ.LJJJJJL(this.LLILIL, aCListenerS36S0200000_1);
        C16880lQ.LJIJI(this.LLILL, aCListenerS36S0200000_1);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(new ACListenerS21S0100000_1(this, 149));
        }
    }

    public final void w0(C109544Rq c109544Rq) {
        boolean z;
        boolean z2;
        long j;
        java.util.Set<Long> set;
        HashMap<String, NewLiveRoomStruct> hashMap;
        HashMap<String, NewLiveRoomStruct> hashMap2;
        NewLiveRoomStruct newLiveRoomStruct;
        if (this.LLIIIILZ == 0 || c109544Rq == null) {
            return;
        }
        String LLLLZLLLI = LLLLZLLLI();
        if (TextUtils.isEmpty(LLLLZLLLI)) {
            return;
        }
        java.util.Map<String, Boolean> map = this.LLJILJILJ;
        if (map != null) {
            Boolean bool = map.get(LLLLZLLLI);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        String str = "live";
        String str2 = null;
        if (z && !this.LLJJIJIL) {
            this.LLJ.setVisibility(0);
            this.LLJI.start();
            this.LLILLIZIL.setVisibility(8);
            this.LLILII.setVisibility(0);
            this.LLILLL.setVisibility(8);
            this.LLIILII.setVisibility(8);
            this.LLIZLLLIL.setVisibility(8);
            Context context = this.LLILL.getContext();
            o.LJIIIIZZ(context, "bottomNameTv.context");
            Integer LJI = C79045V0n.LJI(R.attr.dj, context);
            if (LJI != null) {
                this.LLILL.setTextColor(LJI.intValue());
            }
            C16300kU.LJIILLIIL(this.LLILII, null);
            this.LLIIL.setVisibility(8);
        } else {
            java.util.Map<String, Boolean> map2 = this.LLJILLL;
            if (map2 != null && o.LJ(map2.get(LLLLZLLLI), Boolean.TRUE) && !this.LLJJIJIL) {
                this.LLILLJJLI.setText(C86V.LJFF(R.string.mm8));
                B0();
            } else {
                HashMap<String, Boolean> hashMap3 = this.LLJJ;
                if (hashMap3 != null && o.LJ(hashMap3.get(LLLLZLLLI), Boolean.TRUE)) {
                    this.LLILLJJLI.setText(C86V.LJFF(R.string.m84));
                    B0();
                } else {
                    java.util.Map<String, Boolean> map3 = this.LLJJI;
                    if (map3 != null && o.LJ(map3.get(LLLLZLLLI), Boolean.TRUE)) {
                        this.LLILLJJLI.setText(C86V.LJFF(R.string.jyh));
                        B0();
                    } else {
                        z0(true);
                        this.LLJ.setVisibility(8);
                        this.LLJI.cancel();
                        this.LLILLIZIL.setVisibility(8);
                        Context context2 = this.LLILL.getContext();
                        o.LJIIIIZZ(context2, "bottomNameTv.context");
                        Integer LJI2 = C79045V0n.LJI(R.attr.dj, context2);
                        if (LJI2 != null) {
                            this.LLILL.setTextColor(LJI2.intValue());
                        }
                        C16300kU.LJIILLIIL(this.LLILII, this.LLJJIJI);
                        HashMap<String, NewLiveRoomStruct> hashMap4 = this.LLJJIII;
                        if (hashMap4 == null || !hashMap4.containsKey(LLLLZLLLI)) {
                            x0();
                        } else {
                            NewLiveRoomStruct newLiveRoomStruct2 = hashMap4.get(LLLLZLLLI);
                            if (newLiveRoomStruct2 == null || newLiveRoomStruct2.id == 0) {
                                x0();
                            } else {
                                this.LLILII.setVisibility(0);
                                this.LLILLL.setVisibility(8);
                                this.LLIILII.setVisibility(0);
                                this.LLIIL.setVisibility(0);
                                this.LLIZLLLIL.setVisibility(0);
                                t0(newLiveRoomStruct2.roomCover, false);
                                C16300kU.LJIILLIIL(this.LLILII, null);
                                ShareLiveContent shareLiveContent = (ShareLiveContent) this.LLIIIILZ;
                                if (shareLiveContent != null && shareLiveContent.isFromMultiLiveShare()) {
                                    this.LLIILII.setText(C78857UxB.LJJIIZI("pm_mt_multi_invite_badge"));
                                    this.LLIL.setVisibility(0);
                                    this.LLIL.setText(C78857UxB.LJJIIZI("pm_mt_multi_invite_joinfriendasguest"));
                                } else if (newLiveRoomStruct2.getLiveSubOnlyEnable()) {
                                    this.LLIILII.setText(EF7.LIZIZ().getResources().getString(R.string.rtx));
                                    this.LLIL.setVisibility(8);
                                    this.LLIL.setText("");
                                    String valueOf = String.valueOf(newLiveRoomStruct2.ownerUserId);
                                    String l = Long.valueOf(newLiveRoomStruct2.id).toString();
                                    Long valueOf2 = Long.valueOf(newLiveRoomStruct2.maxPreviewTime);
                                    C188727au c188727au = new C188727au();
                                    c188727au.LJIIIZ("enter_from_merge", "chat");
                                    c188727au.LJIIIZ("enter_method", "live_cover");
                                    c188727au.LJIIIZ("action_type", "click");
                                    c188727au.LJIIIZ("anchor_id", valueOf);
                                    c188727au.LJIIIZ("room_id", l);
                                    c188727au.LJIIIZ("_params_live_platform", "live");
                                    if (valueOf2 != null) {
                                        j = valueOf2.longValue();
                                    } else {
                                        j = 0;
                                    }
                                    c188727au.LJ(j / 1000, "maximum_preview_duration");
                                    FMX.LJIIL("livesdk_sub_only_live_preview_show", c188727au.LIZ);
                                } else {
                                    this.LLIILII.setText(EF7.LIZIZ().getResources().getString(R.string.r45));
                                    this.LLIL.setVisibility(8);
                                    this.LLIL.setText("");
                                }
                            }
                            z2 = true;
                            long msgId = c109544Rq.getMsgId();
                            set = this.LLJILJIL;
                            if (set != null || !z2 || msgId == 0) {
                                return;
                            }
                            C188727au c188727au2 = new C188727au();
                            String LLLLZLLLI2 = LLLLZLLLI();
                            if (!C78685UuP.LJJJZ(LLLLZLLLI2) || (hashMap = this.LLJJIII) == null || !hashMap.containsKey(LLLLZLLLI2) || (hashMap2 = this.LLJJIII) == null || (newLiveRoomStruct = hashMap2.get(LLLLZLLLI2)) == null || newLiveRoomStruct.id == 0) {
                                str = "end";
                            }
                            ShareLiveContent shareLiveContent2 = (ShareLiveContent) this.LLIIIILZ;
                            if (shareLiveContent2 != null) {
                                str2 = shareLiveContent2.getSharedEnterFrom();
                            }
                            if (o.LJ(str2, "stream_goal")) {
                                str = "stream_goal";
                            }
                            c188727au2.LJI("show_type", str);
                            c188727au2.LJ(c109544Rq.getSender(), "from_user_id");
                            new AqS151S0100000_1(c188727au2, 816).invoke();
                            set.add(Long.valueOf(msgId));
                            return;
                        }
                    }
                }
            }
        }
        z2 = false;
        long msgId2 = c109544Rq.getMsgId();
        set = this.LLJILJIL;
        if (set != null) {
        }
    }

    public final void z0(final boolean z) {
        C84763Ui c84763Ui = this.LLJJIJIIJIL;
        if (c84763Ui != null) {
            C84683Ua.LJFF.LIZ(c84763Ui, new C3UY(z) { // from class: X.4K1
                public final boolean LIZLLL;

                public final Object[] LIZ() {
                    return new Object[]{Boolean.valueOf(this.LIZLLL)};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C4K1) {
                        return C78966Uyw.LJIIIZ(((C4K1) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("MsgShareLiveThumbnailResult:%s", LIZ());
                }

                {
                    super(null, null, C0DC.LIZIZ("is_success", Boolean.valueOf(z)), 3);
                    this.LIZLLL = z;
                }
            });
        }
        this.LLJJIJIIJIL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4RJ(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLJJJIL = C77266UUc.LIZIZ.getRelationService().LJFF();
        this.LLJJJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 814));
        View findViewById = itemView.findViewById(R.id.b0n);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.bubble_ll)");
        this.LLIIIL = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.bt8);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.content_avatar_iv)");
        this.LLIIIZ = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.bu6);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.content_name_tv)");
        this.LLIIJI = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.btp);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.content_follow_tv)");
        this.LLIIJLIL = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.bti);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.content_cover_iv)");
        this.LLIIL = (SmartImageView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.btx);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.content_live_iv)");
        this.LLIILII = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.bu8);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.content_photo_iv)");
        this.LLIILZL = (ImageView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.buk);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.content_video_iv)");
        this.LLIIZ = findViewById8;
        View findViewById9 = itemView.findViewById(R.id.buh);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.content_title_tv)");
        this.LLIL = (TextView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.ap_);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.bottom_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById10;
        this.LLILII = viewGroup;
        View findViewById11 = itemView.findViewById(R.id.aoq);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.bottom_avatar_iv)");
        this.LLILIL = (C62846OlW) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.aqm);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.bottom_name_tv)");
        this.LLILL = (TextView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.z2);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.…age_restricted_container)");
        this.LLILLIZIL = (ViewGroup) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.zb);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.….age_restricted_title_tv)");
        this.LLILLJJLI = (TextView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.mtj);
        o.LJIIIIZZ(findViewById15, "itemView.findViewById(R.id.unlive_info_container)");
        this.LLILLL = (ViewGroup) findViewById15;
        View findViewById16 = itemView.findViewById(R.id.mth);
        o.LJIIIIZZ(findViewById16, "itemView.findViewById(R.id.unlive_avatar_iv)");
        this.LLILZ = (C62846OlW) findViewById16;
        View findViewById17 = itemView.findViewById(R.id.mtl);
        o.LJIIIIZZ(findViewById17, "itemView.findViewById(R.id.unlive_name_tv)");
        this.LLILZIL = (TextView) findViewById17;
        View findViewById18 = itemView.findViewById(R.id.mti);
        o.LJIIIIZZ(findViewById18, "itemView.findViewById(R.id.unlive_follow_iv)");
        this.LLILZLL = (TextView) findViewById18;
        View findViewById19 = itemView.findViewById(R.id.mtk);
        o.LJIIIIZZ(findViewById19, "itemView.findViewById(R.id.unlive_more_video_tv)");
        this.LLIZ = (TextView) findViewById19;
        View findViewById20 = itemView.findViewById(R.id.ant);
        o.LJIIIIZZ(findViewById20, "itemView.findViewById(R.id.border_view)");
        this.LLIZLLLIL = findViewById20;
        View findViewById21 = itemView.findViewById(R.id.g8p);
        o.LJIIIIZZ(findViewById21, "itemView.findViewById(R.id.loading_layout)");
        this.LLJ = findViewById21;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(itemView.findViewById(R.id.g94), (Property<View, Float>) View.ROTATION, 0.0f, 360.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(loadingView, View.ROTATION, 0.0f, 360.0f)");
        this.LLJI = ofFloat;
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        this.LLJIJIL = new C4RK(itemView);
        this.LLJJIJI = C04270Et.LIZIZ(viewGroup.getContext(), R.drawable.bgw);
    }

    public final void t0(UrlModel urlModel, boolean z) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        if (z) {
            Context context = this.LLIIL.getContext();
            o.LJIIIIZZ(context, "coverIv.context");
            LJII.LJIILL(new C80933VpZ(context, 5));
        }
        LJII.LJIIJJI = R.drawable.bkc;
        LJII.LJIILL = R.drawable.bkc;
        LJII.LJJIIJ = this.LLIIL;
        C16880lQ.LLJJJ(LJII);
    }

    public static void v0(C62846OlW c62846OlW, UrlModel urlModel, int i) {
        if (urlModel == null) {
            c62846OlW.setController(null);
            c62846OlW.getHierarchy().LJIJ(i);
        } else {
            C4AS.LJIIIIZZ(c62846OlW, urlModel, "ShareLiveReceiveViewHolder", i, i, null, null, 0, 0, 960);
        }
    }

    public static void s0(View view, int i, BaseContent baseContent, C109544Rq c109544Rq) {
        view.setTag(50331648, Integer.valueOf(i));
        view.setTag(100663296, baseContent);
        view.setTag(134217728, c109544Rq);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        float f;
        float f2;
        o.LJIIIZ(msg, "msg");
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            V8L LJJJI = g0.LJJJI(c4ah, context);
            V92 hierarchy = this.LLIIL.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIL(LJJJI);
            }
        }
        C49V c49v2 = new C49V(c49v.LIZ, new C1042347f(R.dimen.t5), null, 4);
        View view = this.LLIZLLLIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v2);
        view.setBackground(gradientDrawable);
        C49V c49v3 = new C49V(c49v.LIZ, null, new C48E(C1EU.LIZ(this.itemView, "itemView.context", R.attr.cv)), 2);
        View view2 = this.LLJ;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable2, c49v3);
        view2.setBackground(gradientDrawable2);
        C49V c49v4 = new C49V(c49v.LIZ, null, new C48E(C1EU.LIZ(this.itemView, "itemView.context", R.attr.ef)), 2);
        ViewGroup viewGroup = this.LLILLL;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable3, c49v4);
        viewGroup.setBackground(gradientDrawable3);
        C4AH c4ah2 = c49v.LIZ;
        if (c4ah2 != null) {
            f = c4ah2.LJLJJI;
            f2 = c4ah2.LJLJI;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C49V c49v5 = new C49V(new C4AH(0.0f, 0.0f, f2, f), null, null, 6);
        Integer[] numArr = new Integer[2];
        int i = 0;
        numArr[0] = 0;
        Integer LIZIZ = C19N.LIZIZ(this.LLJ, "loadingLayout.context", R.attr.ee);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        }
        numArr[1] = Integer.valueOf(i);
        GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ORZ.LLJ(C47261Igj.LJJIJIIJI(numArr)));
        C77413UZt.LJFF(gradientDrawable4, c49v5);
        this.LLJJIJI = gradientDrawable4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Ui, X.3UX] */
    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, ShareLiveContent shareLiveContent, int i) {
        String str;
        ShareLiveContent shareLiveContent2 = shareLiveContent;
        o.LJIIIZ(msg, "msg");
        final String uuid = msg.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        ?? r2 = new C3UX(uuid) { // from class: X.3Ui
            public final String LJ;

            public final int hashCode() {
                return Objects.hash(this.LJ);
            }

            @Override // X.C3UX
            public final String toString() {
                return C78966Uyw.LJJJLL("MsgShareLiveThumbnailLoaded:%s", this.LJ);
            }

            {
                super("im_share_live_show_cover", null, 0.0f, C3US.TEA, 6);
                this.LJ = uuid;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C84763Ui)) {
                    return false;
                }
                return C78966Uyw.LJIIIZ(new Object[]{((C84763Ui) obj).LJ}, new Object[]{this.LJ});
            }
        };
        C84683Ua.LJFF.LIZIZ(r2, true);
        this.LLJJIJIIJIL = r2;
        this.LLJJIJIL = false;
        this.LLIIZ.setVisibility(8);
        this.LLIILII.setVisibility(0);
        this.LLIIJLIL.setVisibility(8);
        this.LLIILZL.setVisibility(8);
        this.LLIIIL.setVisibility(8);
        this.LLILLL.setVisibility(8);
        this.LLILII.setVisibility(0);
        this.LLIL.setVisibility(8);
        if (shareLiveContent2 != null) {
            t0(shareLiveContent2.getRoomCover(), false);
            C4AS.LJII(this.LLIIIZ, shareLiveContent2.getRoomOwnerAvatar(), "ShareLiveReceiveViewHolder", null, null, 0, 0, 504);
            v0(this.LLILIL, shareLiveContent2.getRoomOwnerAvatar(), R.drawable.bjc);
            this.LLIIJI.setText(shareLiveContent2.getRoomOwnerName());
            this.LLILL.setText(shareLiveContent2.getRoomOwnerName());
            String roomOwnerId = shareLiveContent2.getRoomOwnerId();
            String roomId = shareLiveContent2.getRoomId();
            long sender = msg.getSender();
            C1HQ c1hq = new C1HQ();
            if (roomId == null) {
                roomId = "";
            }
            c1hq.put("room_id", roomId);
            if (roomOwnerId == null) {
                roomOwnerId = "";
            }
            c1hq.put("anchor_id", roomOwnerId);
            c1hq.put("action_type", "click");
            c1hq.put("enter_from_merge", "chat");
            c1hq.put("enter_method", "live_cover");
            c1hq.put("_params_live_platform", "live");
            c1hq.put("from_user_id", String.valueOf(sender));
            C78688UuS.LJJJJZ(c1hq);
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 23);
        }
        s0(this.LLIIIZ, 24, shareLiveContent2, msg);
        s0(this.LLIIJI, 24, shareLiveContent2, msg);
        s0(this.LLIIJLIL, 5, shareLiveContent2, msg);
        s0(this.LLILZLL, 5, shareLiveContent2, msg);
        s0(this.LLIZ, 24, shareLiveContent2, msg);
        s0(this.LLILIL, 24, shareLiveContent2, msg);
        s0(this.LLILL, 24, shareLiveContent2, msg);
        C4RK c4rk = this.LLJIJIL;
        c4rk.LJLILLLLZI = msg;
        c4rk.LJLJI = shareLiveContent2;
        String string = EF7.LIZIZ().getResources().getString(R.string.r47);
        o.LJIIIIZZ(string, "getApplicationContext().….share_dm_live_following)");
        w0(msg);
        if (this.LLIZ.getPaint().measureText(string) > C17N.LJIILL(106.0d)) {
            this.LLIZ.setTextSize(10.0f);
        } else {
            this.LLIZ.setTextSize(14.0f);
        }
        if (shareLiveContent2 != null) {
            str = shareLiveContent2.getRoomOwnerId();
        } else {
            str = null;
        }
        this.LLJJJ = str;
        this.LLJJJIL.observeForever((Observer) this.LLJJJJ.getValue());
    }

    @Override // X.C4RQ
    public final void LJZL(HashMap<String, NewLiveRoomStruct> hashMap, HashMap<String, Boolean> hashMap2, HashMap<String, Boolean> hashMap3, HashMap<String, Boolean> hashMap4, HashMap<String, Boolean> hashMap5, java.util.Set<Long> set) {
        this.LLJJIII = hashMap;
        this.LLJILJILJ = hashMap2;
        this.LLJJ = hashMap4;
        this.LLJILLL = hashMap3;
        this.LLJJI = hashMap5;
        this.LLJILJIL = set;
    }
}
