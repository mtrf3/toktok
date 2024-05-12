package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15760jc {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2 == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.util.List r7) {
        /*
            java.lang.String r0 = "filterList"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r7.isEmpty()
            r3 = 0
            if (r0 == 0) goto Ld
            return r3
        Ld:
            X.J0d<java.lang.String> r0 = X.InterfaceC30442Bx8.LJIJJ
            java.lang.Object r5 = r0.LIZJ()
            java.lang.String r5 = (java.lang.String) r5
            X.J0d<java.lang.String> r0 = X.InterfaceC30442Bx8.LJIL
            java.lang.Object r4 = r0.LIZJ()
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r7.size()
            r2 = 0
        L22:
            if (r2 >= r1) goto L7e
            com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting r6 = com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting.INSTANCE
            boolean r0 = r6.isComposerSupported()
            if (r0 == 0) goto L42
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getResourceId()
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto L42
        L3c:
            if (r2 != 0) goto L41
        L3e:
            LIZIZ(r3, r7)
        L41:
            return r2
        L42:
            boolean r0 = r6.isComposerSupported()
            if (r0 != 0) goto L5b
            if (r4 == 0) goto L5b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getResourceId()
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto L5b
            goto L3c
        L5b:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getFilterId()
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 == 0) goto L7b
            X.J0d<java.lang.String> r1 = X.InterfaceC30442Bx8.LJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.getResourceId()
            r1.LIZ(r0)
            goto L3c
        L7b:
            int r2 = r2 + 1
            goto L22
        L7e:
            r2 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15760jc.LIZ(java.util.List):int");
    }

    public static void LIZIZ(int i, List filterList) {
        o.LJIIIZ(filterList, "filterList");
        if (i >= 0 && i < filterList.size()) {
            InterfaceC30442Bx8.LJIJI.LIZ(Integer.valueOf(i));
            InterfaceC30442Bx8.LJIJJ.LIZ(((LiveEffect) ListProtector.get(filterList, i)).getFilterId());
            InterfaceC30442Bx8.LJIL.LIZ(((LiveEffect) ListProtector.get(filterList, i)).getResourceId());
        } else {
            InterfaceC30442Bx8.LJIJI.LIZ(0);
            InterfaceC30442Bx8.LJIJJ.LIZ(CardStruct.IStatusCode.DEFAULT);
            InterfaceC30442Bx8.LJIL.LIZ(CardStruct.IStatusCode.DEFAULT);
        }
    }
}
