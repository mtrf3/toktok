package X;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Xqr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86109Xqr extends AbstractViewOnClickListenerC86477Xwn implements WeakHandler.IHandler {
    public java.util.Map<Integer, View> _$_findViewCache;
    public final TuxTextView accept;
    public final RelationButton followBtn;
    public InnerPushMessage msg;
    public final C116414hZ spinner;
    public User userInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C86109Xqr(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C86109Xqr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public String getSchemaUrl(View view) {
        return null;
    }

    private final void initButton(User user) {
        InnerPushMessage curMsg;
        if (user != null) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "userService().curUser");
            if (curUser.isAccuratePrivateAccount() && (curMsg = getCurMsg()) != null && curMsg.getType() == 9 && user.getFollowerStatus() != 1) {
                this.accept.setVisibility(0);
                this.followBtn.setVisibility(8);
                this.spinner.setVisibility(8);
                C16880lQ.LJJJJI(this.accept, this);
            } else {
                this.followBtn.setVisibility(0);
                this.accept.setVisibility(8);
                this.spinner.setVisibility(8);
                this.followBtn.setPadding(0, 0, 0, 0);
                RelationButton relationButton = this.followBtn;
                C226668v0 c226668v0 = new C226668v0();
                c226668v0.LIZ = user;
                c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
                c226668v0.LIZJ(EnumC57853MnB.CUSTOM_INNER_PUSH);
                relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                this.followBtn.setTracker(C86114Xqw.LJLIL);
                this.followBtn.setFollowClickListener(new AqS197S0100000_15(this, 16));
            }
            RelationButton relationButton2 = this.followBtn;
            if (relationButton2 != null) {
                relationButton2.setFollowClickInterceptor(new C86108Xqq(this, user, null));
            }
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public void bindContent(InnerPushMessage message) {
        List<User> fromUsers;
        o.LJIIIZ(message, "message");
        super.bindContent(message);
        InnerPushUITemplate uiTemplate = message.getUiTemplate();
        if (uiTemplate != null && (fromUsers = uiTemplate.getFromUsers()) != null && (!fromUsers.isEmpty())) {
            User user = (User) ListProtector.get(fromUsers, 0);
            this.userInfo = user;
            initButton(user);
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public boolean handleClick(View view) {
        Integer num;
        String uid;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != R.id.djn) {
            return false;
        }
        this.spinner.setVisibility(0);
        this.followBtn.setVisibility(8);
        this.accept.setVisibility(8);
        User user = this.userInfo;
        if (user != null && (uid = user.getUid()) != null) {
            NoticeServiceImpl.LJJJJJ().LJIILL(new WeakHandler(this), uid);
        }
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null) {
            C86496Xx6.LJI(curMsg, "follow_approve");
            return true;
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        BaseResponse baseResponse;
        User user = this.userInfo;
        if (user != null) {
            Object obj = null;
            if (message != null) {
                obj = message.obj;
            }
            if ((obj instanceof BaseResponse) && (baseResponse = (BaseResponse) obj) != null && NoticeServiceImpl.LJJJJJ().LJJIIZ(baseResponse)) {
                user.setFollowerStatus(1);
                if (user.getFollowStatus() == 1) {
                    user.setFollowStatus(2);
                }
                initButton(user);
            }
        }
    }

    public final void setViewMaxWidth(int i) {
        this.followBtn.setMaxWidth(i);
        this.accept.setMaxWidth(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86109Xqr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate;
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.ba9, context) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.ba9, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(context, R.layout.ba9, this);
        }
        View findViewById = inflate.findViewById(R.id.dk2);
        o.LJIIIIZZ(findViewById, "buttonContainer.findView…nButton>(R.id.follow_btn)");
        this.followBtn = (RelationButton) findViewById;
        View findViewById2 = inflate.findViewById(R.id.djn);
        o.LJIIIIZZ(findViewById2, "buttonContainer.findView…View>(R.id.follow_accept)");
        this.accept = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.dkk);
        o.LJIIIIZZ(findViewById3, "buttonContainer.findView…ner>(R.id.follow_loading)");
        this.spinner = (C116414hZ) findViewById3;
    }

    public /* synthetic */ C86109Xqr(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
