package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.RoomInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MV0 extends C56906MVa {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public C56767MPr LJLJJL;
    public long[] LJLJJLL;
    public int LJLJL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        InterfaceC56771MPv interfaceC56771MPv;
        super.reportShowEvent();
        C56767MPr c56767MPr = this.LJLJJL;
        if (c56767MPr != null && (interfaceC56771MPv = this.vm) != null) {
            interfaceC56771MPv.vP(c56767MPr, new AqS156S0200000_9(c56767MPr, this, 30));
        }
    }

    public MV0(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLILLLLZI = ap9;
        View findViewById3 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_name)");
        TextView textView = (TextView) findViewById3;
        this.LJLJI = textView;
        View findViewById4 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.h4i);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.notification_button)");
        TextView textView2 = (TextView) findViewById5;
        this.LJLJL = -1;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(ap9.getAvatarImageView(), MVP.AVATAR, 0.0f);
            MVR.LIZ(textView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(ap9);
        }
        C7FA.LIZIZ(textView2);
        C16880lQ.LJIJI(textView2, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        User user;
        Integer valueOf;
        long j;
        RoomInfo roomInfo;
        Long l;
        long j2;
        RoomInfo roomInfo2;
        Long l2;
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            C56767MPr c56767MPr = this.LJLJJL;
            if (c56767MPr != null && (user = c56767MPr.LIZ) != null) {
                String str = null;
                if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
                    return;
                }
                if (valueOf.intValue() == R.id.h5p || valueOf.intValue() == R.id.h4i) {
                    BaseNotice baseNotice = this.mMTBaseNotice;
                    if (baseNotice != null) {
                        str = baseNotice.getAccountType();
                    }
                    logNotificationClick(str, getLayoutPosition());
                    LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
                    Context context = this.mContext;
                    o.LJIIIIZZ(context, "context");
                    String requestId = user.getRequestId();
                    String uid = user.getUid();
                    o.LJIIIIZZ(uid, "it.uid");
                    LJIIIIZZ.LJI(context, requestId, user.roomId, uid);
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.mLogData.requestId = user.getRequestId();
                    if (e1.LIZ(31744, "enable_inbox_live_slide", true, false)) {
                        C78461Uqn LJIILL = LiveOuterService.LJJJLL().LJIILL();
                        Context context2 = this.mContext;
                        long[] jArr = this.LJLJJLL;
                        if (jArr == null) {
                            jArr = new long[0];
                        }
                        C56767MPr c56767MPr2 = this.LJLJJL;
                        if (c56767MPr2 != null && (roomInfo2 = c56767MPr2.LIZJ) != null && (l2 = roomInfo2.ownerUserId) != null) {
                            j2 = l2.longValue();
                        } else {
                            j2 = 0;
                        }
                        LJIILL.LJIIJJI(context2, enterRoomConfig, user, jArr, j2, this.LJLJL);
                        return;
                    }
                    C78461Uqn LJIILL2 = LiveOuterService.LJJJLL().LJIILL();
                    Context context3 = this.mContext;
                    long[] jArr2 = new long[0];
                    C56767MPr c56767MPr3 = this.LJLJJL;
                    if (c56767MPr3 != null && (roomInfo = c56767MPr3.LIZJ) != null && (l = roomInfo.ownerUserId) != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    LJIILL2.LJIIJJI(context3, enterRoomConfig, user, jArr2, j, this.LJLJL);
                    return;
                }
                if (valueOf.intValue() != R.id.h4v) {
                    return;
                }
                C78857UxB.LJJIFFI(user.getUid(), user.getSecUid(), "message", C56906MVa.buildOpenAwemeLogExtra$default(this, null, 1, null));
                String uid2 = user.getUid();
                BaseNotice baseNotice2 = this.mMTBaseNotice;
                if (baseNotice2 != null) {
                    str = baseNotice2.getAccountType();
                }
                ViewOnClickListenerC56908MVc.logEnterPersonalDetail(uid2, "notification_page", "click_head", str);
                return;
            }
            return;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26045AKb c26045AKb = new C26045AKb(itemView);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    public final void M(C56767MPr c56767MPr, long[] jArr, int i) {
        UrlModel urlModel;
        String str;
        String str2;
        int i2;
        String str3;
        String string;
        User user;
        String str4;
        String str5;
        if (c56767MPr == null) {
            return;
        }
        this.LJLJL = i;
        this.LJLJJL = c56767MPr;
        this.LJLJJLL = jArr;
        User user2 = c56767MPr.LIZ;
        String str6 = null;
        if (user2 != null) {
            urlModel = user2.getAvatarThumb();
            str = user2.getCustomVerify();
            str2 = user2.getEnterpriseVerifyReason();
            i2 = user2.getVerificationType();
        } else {
            urlModel = null;
            str = null;
            str2 = null;
            i2 = -1;
        }
        this.LJLILLLLZI.setUserData(new UserVerify(urlModel, str, str2, Integer.valueOf(i2)));
        this.LJLILLLLZI.LIZ();
        if (user2 != null) {
            C56906MVa.setClickableNameText$default(this, this.LJLJI, user2, null, null, null, 28, null);
        }
        RoomInfo roomInfo = c56767MPr.LIZJ;
        if (roomInfo != null) {
            str3 = roomInfo.title;
        } else {
            str3 = null;
        }
        if (C78685UuP.LJJJZ(str3)) {
            if (c56767MPr.type == 14) {
                Resources LIZJ = MSH.LIZJ();
                Object[] objArr = new Object[1];
                RoomInfo roomInfo2 = c56767MPr.LIZJ;
                if (roomInfo2 != null) {
                    str5 = roomInfo2.title;
                } else {
                    str5 = null;
                }
                objArr[0] = str5;
                string = LIZJ.getString(R.string.iwi, objArr);
            } else {
                Resources LIZJ2 = MSH.LIZJ();
                Object[] objArr2 = new Object[1];
                RoomInfo roomInfo3 = c56767MPr.LIZJ;
                if (roomInfo3 != null) {
                    str4 = roomInfo3.title;
                } else {
                    str4 = null;
                }
                objArr2[0] = str4;
                string = LIZJ2.getString(R.string.hbv, objArr2);
            }
            o.LJIIIIZZ(string, "{\n        if (type == LI…d, title)\n        }\n    }");
        } else {
            string = MSH.LIZJ().getString(R.string.hbu);
            o.LJIIIIZZ(string, "{\n        resources.getS…owed_live_no_title)\n    }");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.mContext.getString(R.string.hkw));
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)), length, spannableStringBuilder.length(), 17);
        this.LJLJJI.setText(spannableStringBuilder);
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null) {
            LJJJLL.LJII();
            C54285LSf.LIZ.LIZ(0, "ttlive_inbox_new_message_entrance", C51029K0z.LJJIIZI(new OSZ("source", "under_the_new_tab")));
        }
        C56767MPr c56767MPr2 = this.LJLJJL;
        if (c56767MPr2 != null && (user = c56767MPr2.LIZ) != null) {
            str6 = user.roomData;
        }
        LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("message", "live_cell", (SlimRoom) C75792yF.LIZ(str6, SlimRoom.class)));
    }
}
