package com.ss.android.ugc.aweme.creatoredit;

import X.C221108m2;
import X.C62822Ol8;
import X.C65822iA;
import X.C72472st;
import X.C72482su;
import X.C72492sv;
import X.C72502sw;
import X.V8H;
import X.XLM;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class CreatorCaptionEditViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C72502sw.LJLIL);
    public final XLM LJLILLLLZI;
    public final XLM LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public CreatorCaptionEditItem LJLJJLL;
    public List<String> LJLJL;
    public final List<String> LJLJLJ;

    public final MutableLiveData<Aweme> gv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public final MutableLiveData<C65822iA> hv0() {
        return (MutableLiveData) this.LJLJJI.getValue();
    }

    public final MutableLiveData<Boolean> iv0() {
        return (MutableLiveData) this.LJLJJL.getValue();
    }

    public CreatorCaptionEditViewModel() {
        C221108m2.LIZIZ(C72482su.LJLIL);
        XLM LIZ = V8H.LIZ(Boolean.FALSE);
        this.LJLILLLLZI = LIZ;
        this.LJLJI = LIZ;
        this.LJLJJI = C221108m2.LIZIZ(C72492sv.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(C72472st.LJLIL);
        this.LJLJLJ = new ArrayList();
    }

    public final boolean jv0() {
        C65822iA value = hv0().getValue();
        if (value != null && value.LIZ > 0) {
            return true;
        }
        return false;
    }

    public final boolean kv0() {
        C65822iA value = hv0().getValue();
        if (value != null && value.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r7.setValue(java.lang.Boolean.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lv0() {
        /*
            r8 = this;
            androidx.lifecycle.MutableLiveData r7 = r8.iv0()
            java.util.List<java.lang.String> r0 = r8.LJLJLJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
            r4 = 0
        Le:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r3 = r6.next()
            int r2 = r4 + 1
            r1 = 0
            if (r4 < 0) goto L44
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem r0 = r8.LJLJJLL
            if (r0 == 0) goto L33
            java.util.List r0 = r0.getTransSubtitleItem()
            if (r0 == 0) goto L33
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData r0 = (com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData) r0
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.getText()
        L33:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r3)
            if (r0 != 0) goto L42
            r5 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.setValue(r0)
            return
        L42:
            r4 = r2
            goto Le
        L44:
            X.C47261Igj.LJJJJJ()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel.lv0():void");
    }
}
