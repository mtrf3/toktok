package X;

import java.util.HashMap;

/* renamed from: X.18K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18K extends AbstractC008301n<Object> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ AbstractC18470nz LIZIZ;
    public final /* synthetic */ AbstractC008601q LIZJ;

    public final void LIZIZ() {
        this.LIZJ.LJ(this.LIZ);
    }

    public final void LIZ(Object obj) {
        Integer num = (Integer) ((HashMap) this.LIZJ.LIZJ).get(this.LIZ);
        if (num != null) {
            this.LIZJ.LJ.add(this.LIZ);
            try {
                this.LIZJ.LIZIZ(num.intValue(), this.LIZIZ, obj);
                return;
            } catch (Exception e) {
                this.LIZJ.LJ.remove(this.LIZ);
                throw e;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" and input ");
        LIZ.append(obj);
        LIZ.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public C18K(AbstractC008601q abstractC008601q, String str, AbstractC18470nz abstractC18470nz) {
        this.LIZJ = abstractC008601q;
        this.LIZ = str;
        this.LIZIZ = abstractC18470nz;
    }
}
