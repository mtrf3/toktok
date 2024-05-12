package X;

import X.AbstractC56012Ht;
import X.C0I6;
import java.util.UUID;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48231ut<API_COMPONENT extends C0I6, SCENE extends AbstractC56012Ht<STATE, ACTION>, STATE, ACTION> extends AbstractC41331jl<API_COMPONENT, STATE, ACTION> {
    public final String LJLJI;
    public int LJLJJI;
    public Class<?> LJLJJL;
    public EnumC06840Oq LJLJJLL;
    public final C5H3 LJLJL;
    public final InterfaceC65784Pro<SCENE> LJLJLJ;
    public final WMH LJLJLLL;

    public final SCENE LJLJJL() {
        return (SCENE) this.LJLJL.getValue();
    }

    public final EnumC06840Oq LJLIIL() {
        EnumC06840Oq enumC06840Oq = this.LJLJJLL;
        if (enumC06840Oq != null) {
            return enumC06840Oq;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    public final Class<?> LJLJLJ() {
        Class<?> cls = this.LJLJJL;
        if (cls != null) {
            return cls;
        }
        o.LJIJI("uiClass");
        throw null;
    }

    public void hide() {
        C0Y1.LIZ(new IDqS420S0100000((AbstractC48231ut) this, 67));
    }

    public void show() {
        C0Y1.LIZ(new IDqS420S0100000((AbstractC48231ut) this, 70));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        WM7 findSceneByTag = this.LJLJLLL.findSceneByTag(this.LJLJI);
        if (findSceneByTag != null) {
            this.LJLJLLL.remove(findSceneByTag);
        }
        EnumC06840Oq enumC06840Oq = this.LJLJJLL;
        if (enumC06840Oq != null) {
            if (enumC06840Oq == EnumC06840Oq.SHOW) {
                show();
                return;
            }
            return;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    public InterfaceC65784Pro<SCENE> LJLJJLL() {
        return this.LJLJLJ;
    }

    public AbstractC48231ut(WMH _parentScene) {
        o.LJIIIZ(_parentScene, "_parentScene");
        this.LJLJLLL = _parentScene;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UISlotComponent#");
        LIZ.append(getClass().getName());
        LIZ.append('#');
        LIZ.append(UUID.randomUUID());
        this.LJLJI = X1D.LIZIZ(LIZ);
        this.LJLJL = C221108m2.LIZIZ(new IDqS420S0100000((AbstractC48231ut) this, 68));
        this.LJLJLJ = new IDqS420S0100000((AbstractC48231ut) this, 69);
    }

    public final void LJLLILLLL(EnumC06840Oq enumC06840Oq) {
        o.LJIIIZ(enumC06840Oq, "<set-?>");
        this.LJLJJLL = enumC06840Oq;
    }

    public final void LJLLL(Class<?> cls) {
        o.LJIIIZ(cls, "<set-?>");
        this.LJLJJL = cls;
    }
}
