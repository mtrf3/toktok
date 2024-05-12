package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MVj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56915MVj extends AbstractViewOnClickListenerC56920MVo {
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
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

    public final java.util.Map<String, String> getExtra() {
        JSONObject jSONObject;
        GeneralTemplateNotice generalTemplateNotice;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MusNotice mBaseNotice = getMBaseNotice();
        if (mBaseNotice != null && (generalTemplateNotice = mBaseNotice.templateNotice) != null && (str = generalTemplateNotice.messageExtra) != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                if (o.LJ(key, "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(key));
                    Iterator<String> keys2 = jSONObject2.keys();
                    o.LJIIIIZZ(keys2, "business.keys()");
                    while (keys2.hasNext()) {
                        String businessKey = keys2.next();
                        o.LJIIIIZZ(businessKey, "businessKey");
                        String optString = jSONObject2.optString(businessKey);
                        o.LJIIIIZZ(optString, "business.optString(businessKey)");
                        linkedHashMap.put(businessKey, optString);
                    }
                } else if (!linkedHashMap.containsKey(key)) {
                    o.LJIIIIZZ(key, "key");
                    String optString2 = jSONObject.optString(key);
                    o.LJIIIIZZ(optString2, "json.optString(key)");
                    linkedHashMap.put(key, optString2);
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return linkedHashMap;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public MWI getTemplatePosition() {
        return MWI.Right;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final String LIZJ(View view) {
        Integer valueOf;
        GeneralTemplateNotice templateNotice;
        NoticeUITemplate noticeUITemplate;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return null;
        }
        if ((valueOf.intValue() != R.id.h4i && valueOf.intValue() != R.id.j2s && valueOf.intValue() != R.id.h4e) || (templateNotice = getTemplateNotice()) == null || (noticeUITemplate = templateNotice.uiTemplate) == null) {
            return null;
        }
        return noticeUITemplate.rightSchemaUrl;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final boolean LIZLLL(View view) {
        Integer num;
        String LIZJ;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || ((num.intValue() != R.id.h4i && num.intValue() != R.id.j2s && num.intValue() != R.id.h4e) || (LIZJ = LIZJ(view)) == null)) {
            return false;
        }
        LJ(LIZJ);
        return true;
    }

    public final void LJI(boolean z) {
        int i;
        Object parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.view.NotificationTemplateRootLayout");
        View view = (View) parent;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        Resources resources = view.getContext().getResources();
        if (z) {
            i = R.dimen.hc;
        } else {
            i = R.dimen.hb;
        }
        view.setPaddingRelative(paddingStart, paddingTop, resources.getDimensionPixelSize(i), view.getPaddingBottom());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56915MVj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.tk, this, true);
        LJFF(R.id.h4i).getLayoutParams().width = C56812MRk.LIZIZ(context);
        C7FA.LIZIZ(LJFF(R.id.iu_));
        C16880lQ.LJJIZ((SY4) LJFF(R.id.h4i), this);
        C16880lQ.LJJJJLI((C62354Oda) LJFF(R.id.j2s), this);
        if (C99W.LIZ) {
            ((C62354Oda) LJFF(R.id.j2s)).setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJIL((ConstraintLayout) LJFF(R.id.h4e), this);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(LJFF(R.id.j2s), MVP.AVATAR, C32151Nz.LJIIZILJ(2));
        } else {
            C7FA.LIZIZ(LJFF(R.id.j2s));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f4, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b8, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035e  */
    @Override // X.AbstractViewOnClickListenerC56920MVo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r15, X.InterfaceC56930MVy r16) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56915MVj.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, X.MVy):void");
    }
}
