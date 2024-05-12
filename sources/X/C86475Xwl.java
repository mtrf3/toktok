package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86475Xwl extends AbstractViewOnClickListenerC86477Xwn {
    public final C62846OlW LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public /* synthetic */ C86475Xwl(ActivityC45651qj activityC45651qj) {
        this(activityC45651qj, null, 0);
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void bindContent(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        super.bindContent(message);
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("top view bindContent title:");
            LIZ.append(templatePushMsg.getTitle());
            LIZ.append(" avatar2 url:");
            LIZ.append(templatePushMsg.getTitle());
            C86478Xwo.LIZ("inner_push_platform", X1D.LIZIZ(LIZ));
            if (templatePushMsg.getTopType() == 1) {
                this.LJLIL.setVisibility(0);
                V8L v8l = this.LJLIL.getHierarchy().LIZJ;
                if (v8l != null) {
                    v8l.LJFF(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(templatePushMsg.getRightImageRadius()))));
                }
                ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
                layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(templatePushMsg.getTopImageHeight())));
                layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(templatePushMsg.getTopImageWidth())));
                this.LJLIL.setLayoutParams(layoutParams);
                String topImageUrl = templatePushMsg.getTopImageUrl();
                if (topImageUrl == null || topImageUrl.length() == 0) {
                    if (templatePushMsg.getTopImageRes() > 0) {
                        this.LJLIL.setImageResource(templatePushMsg.getTopImageRes());
                        return;
                    } else {
                        this.LJLIL.setVisibility(8);
                        return;
                    }
                }
                C78765Uvh.LJIIIZ(this.LJLIL, templatePushMsg.getTopImageUrl(), -1, -1);
                return;
            }
            setVisibility(8);
        }
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final String getSchemaUrl(View view) {
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null && templatePushMsg.getTopSchemaUrl() != null) {
            return templatePushMsg.getTopSchemaUrl();
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final boolean handleClick(View view) {
        InterfaceC86486Xww LIZ;
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null && (LIZ = C58242MtS.LIZ(curMsg.getType())) != null && LIZ.LIZIZ(4, curMsg)) {
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
    public C86475Xwl(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        View inflate;
        this.LJLILLLLZI = new LinkedHashMap();
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.bae, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.bae, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.bae, this);
        }
        View findViewById = inflate.findViewById(R.id.eni);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.inner_push_top_image)");
        C62846OlW c62846OlW = (C62846OlW) findViewById;
        this.LJLIL = c62846OlW;
        C16880lQ.LJJJJJL(c62846OlW, this);
    }
}
