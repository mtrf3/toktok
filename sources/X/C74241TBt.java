package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TBt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74241TBt extends KL7 {
    public final /* synthetic */ C74240TBs LJLIL;
    public final /* synthetic */ C74243TBv LJLILLLLZI;
    public final /* synthetic */ ContentLanguageGuideSetting LJLJI;

    @Override // X.KL7
    public final Animator LIZ(View view) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(R.id.fjj);
        } else {
            view2 = null;
        }
        o.LJI(view);
        Resources resources = view.getResources();
        o.LJI(resources);
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", 0, resources.getColor(R.color.al));
        ofArgb.setDuration(150L);
        return ofArgb;
    }

    @Override // X.KL7
    public final Animator LIZJ(View view) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(R.id.fjj);
        } else {
            view2 = null;
        }
        o.LJI(view);
        Resources resources = view.getResources();
        o.LJI(resources);
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", resources.getColor(R.color.al), 0);
        ofArgb.setDuration(150L);
        return ofArgb;
    }

    @Override // X.KL7
    public final void LIZIZ(MotionEvent motionEvent, View view) {
        int i;
        C74240TBs c74240TBs = this.LJLIL;
        C74243TBv c74243TBv = this.LJLILLLLZI;
        ContentLanguageGuideSetting contentLanguageGuideSetting = this.LJLJI;
        c74240TBs.getClass();
        try {
            if (!c74240TBs.LJLJJI.contains(contentLanguageGuideSetting.getCode())) {
                int size = c74240TBs.LJLJJI.size();
                int i2 = 5;
                try {
                    SettingsManager.LIZLLL().getClass();
                    i = SettingsManager.LJ("content_lang_limit", 5);
                } catch (Throwable unused) {
                    i = 5;
                }
                if (size >= i) {
                    Context context = c74243TBv.itemView.getContext();
                    Object[] objArr = new Object[1];
                    try {
                        SettingsManager.LIZLLL().getClass();
                        i2 = SettingsManager.LJ("content_lang_limit", 5);
                    } catch (Throwable unused2) {
                    }
                    objArr[0] = String.valueOf(i2);
                    String string = context.getString(R.string.gze, objArr);
                    o.LJIIIIZZ(string, "viewHolder.itemView.cont…imitSetting().toString())");
                    View view2 = c74243TBv.itemView;
                    o.LJIIIIZZ(view2, "viewHolder.itemView");
                    C26045AKb c26045AKb = new C26045AKb(view2);
                    c26045AKb.LJIIIZ(string);
                    c26045AKb.LJIIJ();
                    return;
                }
            }
            if (!c74240TBs.LJLJJI.contains(contentLanguageGuideSetting.getCode())) {
                c74240TBs.LJLJJI.add(contentLanguageGuideSetting.getCode());
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", c74240TBs.LJLJI);
                c188727au.LJIIIZ("language_type", contentLanguageGuideSetting.getCode());
                c188727au.LJIIIZ("click_type", "choose");
                FMX.LJIIL("click_content_language_popup", c188727au.LIZ);
            } else {
                c74240TBs.LJLJJI.remove(contentLanguageGuideSetting.getCode());
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", c74240TBs.LJLJI);
                c188727au2.LJIIIZ("language_type", contentLanguageGuideSetting.getCode());
                c188727au2.LJIIIZ("click_type", "unchoose");
                FMX.LJIIL("click_content_language_popup", c188727au2.LIZ);
            }
            InterfaceC74242TBu interfaceC74242TBu = c74240TBs.LJLILLLLZI;
            String code = contentLanguageGuideSetting.getCode();
            o.LJIIIIZZ(code, "item.code");
            interfaceC74242TBu.LIZJ(code);
            c74243TBv.P();
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C74241TBt(C74240TBs c74240TBs, C74243TBv c74243TBv, ContentLanguageGuideSetting contentLanguageGuideSetting) {
        this.LJLIL = c74240TBs;
        this.LJLILLLLZI = c74243TBv;
        this.LJLJI = contentLanguageGuideSetting;
    }
}
