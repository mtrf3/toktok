package X;

/* loaded from: classes12.dex */
public class PCL extends AbstractC48851JFf {
    public PCL() {
        super(2);
    }

    @Override // X.AbstractC48851JFf
    public final Object LIZIZ(Object[] objArr) {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }
}
