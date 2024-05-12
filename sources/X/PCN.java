package X;

/* loaded from: classes12.dex */
public class PCN extends JFP<Boolean> {
    @Override // X.JFP
    public final Boolean LIZ(Object[] objArr) {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }
}
