package X;

import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* renamed from: X.Af9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26779Af9<T> extends AbstractC26784AfE<T> {
    public abstract IComponentStrategyService<?> LLD();

    @Override // X.AbstractC26784AfE
    public void LL(C73242Soo c73242Soo) {
        Integer num;
        String str;
        String str2;
        Object obj;
        String obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String obj6;
        java.util.Map<String, Object> map = this.LJLJJI;
        Integer num2 = null;
        if (map != null && (obj5 = map.get("biz_type")) != null && (obj6 = obj5.toString()) != null) {
            num = C38350F3i.LJJIL(obj6);
        } else {
            num = null;
        }
        EnumC28000Ayq LJJZZIII = C78866UxK.LJJZZIII(num);
        java.util.Map<String, Object> map2 = this.LJLJJI;
        if (map2 != null && (obj4 = map2.get("page_name")) != null) {
            str = obj4.toString();
        } else {
            str = null;
        }
        java.util.Map<String, Object> map3 = this.LJLJJI;
        if (map3 != null && (obj3 = map3.get("region")) != null) {
            str2 = obj3.toString();
        } else {
            str2 = null;
        }
        java.util.Map<String, Object> map4 = this.LJLJJI;
        if (map4 != null && (obj = map4.get("template")) != null && (obj2 = obj.toString()) != null) {
            num2 = C38350F3i.LJJIL(obj2);
        }
        if (str == null) {
            str = "";
        }
        IComponentStrategyService<?> LIZIZ = C27206Am2.LIZIZ(LJJZZIII, str, str2, num2);
        if (LIZIZ != null || (LIZIZ = LLD()) != null) {
            LIZIZ.LIZ(this, c73242Soo);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC26779Af9(androidx.lifecycle.LifecycleOwner r5, X.AbstractC03160Am r6, java.lang.String r7, java.lang.Integer r8, java.lang.String r9, java.lang.Integer r10, int r11) {
        /*
            r4 = this;
            r0 = r11 & 2
            if (r0 == 0) goto L9
            X.AfB r6 = new X.AfB
            r6.<init>()
        L9:
            r0 = r11 & 8
            r2 = 0
            if (r0 == 0) goto Lf
            r8 = r2
        Lf:
            r0 = r11 & 16
            if (r0 == 0) goto L14
            r9 = r2
        L14:
            r0 = r11 & 32
            if (r0 == 0) goto L19
            r10 = r2
        L19:
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r0 = 4
            X.OSZ[] r3 = new X.OSZ[r0]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "biz_type"
            r1.<init>(r0, r8)
            r0 = 0
            r3[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "region"
            r1.<init>(r0, r9)
            r0 = 1
            r3[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "page_name"
            r1.<init>(r0, r7)
            r0 = 2
            r3[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "template"
            r1.<init>(r0, r10)
            r0 = 3
            r3[r0] = r1
            java.util.Map r0 = X.C113554cx.LJJL(r3)
            r4.<init>(r5, r6, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC26779Af9.<init>(androidx.lifecycle.LifecycleOwner, X.0Am, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, int):void");
    }
}
