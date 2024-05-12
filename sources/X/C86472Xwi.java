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

/* renamed from: X.Xwi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86472Xwi extends AbstractViewOnClickListenerC86477Xwn {
    public final C72433Sbl LJLIL;
    public final C72433Sbl LJLILLLLZI;
    public final C72433Sbl LJLJI;
    public final C72433Sbl LJLJJI;
    public final FrameLayout LJLJJL;
    public final C53873LCj LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        this.LJLIL.setActualImageResource(R.drawable.b7n);
        this.LJLJI.setActualImageResource(R.drawable.b7n);
        this.LJLJJI.setActualImageResource(R.drawable.b7n);
    }

    public /* synthetic */ C86472Xwi(ActivityC45651qj activityC45651qj) {
        this(activityC45651qj, null, 0);
    }

    private final void setAvatarVisible(int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLIL.setVisibility(8);
            this.LJLILLLLZI.setVisibility(8);
            this.LJLJJL.setVisibility(0);
            return;
        }
        this.LJLIL.setVisibility(0);
        this.LJLJJL.setVisibility(8);
    }

    public final void LIZ(InnerPushUITemplate innerPushUITemplate) {
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(innerPushUITemplate.getAvatarRightLabelHeight())));
        layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(innerPushUITemplate.getAvatarRightLabelWidth())));
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        String avatarRightLabelUrl = innerPushUITemplate.getAvatarRightLabelUrl();
        if (avatarRightLabelUrl == null || avatarRightLabelUrl.length() == 0) {
            if (innerPushUITemplate.getAvatarRightLabelDrawable() != null) {
                this.LJLILLLLZI.setVisibility(0);
                this.LJLILLLLZI.setImageDrawable(innerPushUITemplate.getAvatarRightLabelDrawable());
                return;
            } else {
                this.LJLILLLLZI.setVisibility(8);
                return;
            }
        }
        this.LJLILLLLZI.setVisibility(0);
        C78765Uvh.LJIIIZ(this.LJLILLLLZI, innerPushUITemplate.getAvatarRightLabelUrl(), -1, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractViewOnClickListenerC86477Xwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindContent(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r13) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86472Xwi.bindContent(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):void");
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final String getSchemaUrl(View view) {
        InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
        if (templatePushMsg != null) {
            return templatePushMsg.getAvatarSchema();
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC86477Xwn
    public final boolean handleClick(View view) {
        InterfaceC86486Xww LIZ;
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null && (LIZ = C58242MtS.LIZ(curMsg.getType())) != null && LIZ.LIZIZ(1, curMsg)) {
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
    public C86472Xwi(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        View inflate;
        this.LJLJL = new LinkedHashMap();
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.bab, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.bab, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.bab, this);
        }
        setClipChildren(false);
        View findViewById = inflate.findViewById(R.id.en6);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.inner_push_head_single)");
        this.LJLIL = (C72433Sbl) findViewById;
        View findViewById2 = inflate.findViewById(R.id.enb);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.inner_push_notice_icon)");
        this.LJLILLLLZI = (C72433Sbl) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.enj);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.…er_push_top_right_avatar)");
        this.LJLJI = (C72433Sbl) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.en1);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.…_push_bottom_left_avatar)");
        this.LJLJJI = (C72433Sbl) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.en_);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.…ush_multi_head_container)");
        this.LJLJJL = (FrameLayout) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.fvn);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.live_circle)");
        this.LJLJJLL = (C53873LCj) findViewById6;
    }
}
