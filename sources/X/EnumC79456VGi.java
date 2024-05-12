package X;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VGi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC79456VGi {
    public static final EnumC79456VGi INSTANCE;
    public static final /* synthetic */ EnumC79456VGi[] LJLIL;
    public HashMap<String, C38338F2w> idToPresenter = new HashMap<>();
    public HashMap<C38338F2w, String> presenterToId = new HashMap<>();

    static {
        EnumC79456VGi enumC79456VGi = new EnumC79456VGi();
        INSTANCE = enumC79456VGi;
        LJLIL = new EnumC79456VGi[]{enumC79456VGi};
    }

    public static EnumC79456VGi[] values() {
        return (EnumC79456VGi[]) LJLIL.clone();
    }

    public void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    public static EnumC79456VGi valueOf(String str) {
        return (EnumC79456VGi) V0N.LJJJ(EnumC79456VGi.class, str);
    }

    public void add(C38338F2w c38338F2w) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(c38338F2w.getClass()));
        LIZ.append("/");
        LIZ.append(System.nanoTime());
        LIZ.append("/");
        LIZ.append((int) (Math.random() * 2.147483647E9d));
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.idToPresenter.put(LIZIZ, c38338F2w);
        this.presenterToId.put(c38338F2w, LIZIZ);
        c38338F2w.LIZIZ.add(new C79457VGj(this, c38338F2w));
    }

    public String getId(C38338F2w c38338F2w) {
        return this.presenterToId.get(c38338F2w);
    }

    public <P> P getPresenter(String str) {
        return (P) this.idToPresenter.get(str);
    }
}
