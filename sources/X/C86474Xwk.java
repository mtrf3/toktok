package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86474Xwk extends AbstractViewOnClickListenerC86477Xwn {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final ConstraintLayout LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void resetViewsParams() {
        this.LJLIL.setText("");
        this.LJLJI.setText("");
        this.LJLILLLLZI.setText("");
    }

    public /* synthetic */ C86474Xwk(ActivityC45651qj activityC45651qj) {
        this(activityC45651qj, null, 0);
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void bindContent(InnerPushMessage message) {
        boolean z;
        User curUser;
        List<User> fromUsers;
        User user;
        o.LJIIIZ(message, "message");
        super.bindContent(message);
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("middle view bindContent title:");
            LIZ.append(templatePushMsg.getTitle());
            LIZ.append(" avatar2 url:");
            LIZ.append(templatePushMsg.getTitle());
            C86478Xwo.LIZ("inner_push_platform", X1D.LIZIZ(LIZ));
            String title = templatePushMsg.getTitle();
            if (title == null || title.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.LJLIL.setText(templatePushMsg.getTitle());
                TuxTextView tuxTextView = this.LJLJI;
                CharSequence content = templatePushMsg.getContent();
                if (content == null) {
                    content = templatePushMsg.getContentChar();
                }
                tuxTextView.setText(content);
                if (templatePushMsg.getContentLimitLines() != this.LJLJI.getMaxLines()) {
                    this.LJLJI.setMaxLines(templatePushMsg.getContentLimitLines());
                }
            } else {
                this.LJLJJI.setVisibility(8);
                this.LJLJI.setMaxLines(3);
                TuxTextView tuxTextView2 = this.LJLJI;
                CharSequence content2 = templatePushMsg.getContent();
                if (content2 == null && (content2 = templatePushMsg.getContentChar()) == null) {
                    content2 = "";
                }
                tuxTextView2.setText(content2);
            }
            String tagText = templatePushMsg.getTagText();
            if (tagText == null || tagText.length() == 0) {
                if (((Boolean) E1X.LIZIZ.getValue()).booleanValue() && (curUser = ((RBX) HG3.LJIILL()).getCurUser()) != null && curUser.isAccuratePrivateAccount() && (fromUsers = templatePushMsg.getFromUsers()) != null && (user = (User) ORZ.LJLLLL(fromUsers)) != null && user.getFollowStatus() == 1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("· ");
                    LIZ2.append(getContext().getString(R.string.giv));
                    this.LJLILLLLZI.setText(X1D.LIZIZ(LIZ2));
                    this.LJLILLLLZI.setVisibility(0);
                } else {
                    this.LJLILLLLZI.setVisibility(8);
                }
            } else {
                this.LJLILLLLZI.setText(templatePushMsg.getTagText());
                this.LJLILLLLZI.setVisibility(0);
            }
            if (templatePushMsg.getMiddleAlignment() == 1) {
                this.LJLIL.setGravity(17);
                this.LJLJI.setGravity(17);
                setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), 0);
                this.LJLIL.setTuxFont(33);
            }
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final String getSchemaUrl(View view) {
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            return templatePushMsg.getMiddleSchemaUrl();
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final boolean handleClick(View view) {
        InterfaceC86486Xww LIZ;
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null && (LIZ = C58242MtS.LIZ(curMsg.getType())) != null && LIZ.LIZIZ(2, curMsg)) {
            return true;
        }
        String schemaUrl = getSchemaUrl(view);
        if (schemaUrl == null) {
            return false;
        }
        jumpWithRouter(schemaUrl);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86474Xwk(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        View inflate;
        this.LJLJJL = new LinkedHashMap();
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.bac, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.bac, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.bac, this);
        }
        View findViewById = inflate.findViewById(R.id.ena);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.inner_push_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.enf);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.inner_push_tag)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.eng);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.inner_push_title)");
        this.LJLJJI = (ConstraintLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.en3);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.inner_push_content)");
        this.LJLJI = (TuxTextView) findViewById4;
    }
}
