package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86476Xwm extends AbstractViewOnClickListenerC86477Xwn {
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public /* synthetic */ C86476Xwm(ActivityC45651qj activityC45651qj) {
        this(activityC45651qj, null, 0);
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void bindContent(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        super.bindContent(message);
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bottom view bindContent bottomType:");
            LIZ.append(templatePushMsg.getBottomType());
            C86478Xwo.LIZ("inner_push_platform", X1D.LIZIZ(LIZ));
            int bottomType = templatePushMsg.getBottomType();
            if (bottomType != 0) {
                if (bottomType != 3) {
                    setVisibility(8);
                    return;
                } else {
                    setVisibility(0);
                    this.LJLILLLLZI.setVisibility(0);
                    return;
                }
            }
            setVisibility(8);
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final String getSchemaUrl(View view) {
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            return templatePushMsg.getBottomSchemaUrl();
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
    public C86476Xwm(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        View inflate;
        this.LJLJI = new LinkedHashMap();
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.baa, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.baa, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.baa, this);
        }
        View findViewById = inflate.findViewById(R.id.ig0);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.pull_down_bottom)");
        this.LJLIL = findViewById;
        View findViewById2 = inflate.findViewById(R.id.h6r);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.now_daily_post_button)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        C16880lQ.LJIIJ(this, inflate);
    }
}
