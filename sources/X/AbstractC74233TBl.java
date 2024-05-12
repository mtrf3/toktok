package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.TBl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74233TBl implements InterfaceC74234TBm, Serializable {
    public static final Object NO_RECEIVER = C74237TBp.LJLIL;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient InterfaceC74234TBm reflected;
    public final String signature;

    public abstract InterfaceC74234TBm computeReflected();

    public AbstractC74233TBl() {
        this(NO_RECEIVER);
    }

    public InterfaceC74234TBm compute() {
        InterfaceC74234TBm interfaceC74234TBm = this.reflected;
        if (interfaceC74234TBm == null) {
            computeReflected();
            this.reflected = this;
            return this;
        }
        return interfaceC74234TBm;
    }

    public InterfaceC36731EbH getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            C65352Pkq.LIZ.getClass();
            return new C65353Pkr(cls, "");
        }
        return C65352Pkq.LIZ(cls);
    }

    @Override // X.InterfaceC65336Pka
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // X.InterfaceC74234TBm
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC74234TBm getReflected() {
        InterfaceC74234TBm compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C68512Qui();
    }

    @Override // X.InterfaceC74234TBm
    public InterfaceC65332PkW getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // X.InterfaceC74234TBm
    public List<InterfaceC65333PkX> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // X.InterfaceC74234TBm
    public EnumC38081Ex3 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // X.InterfaceC74234TBm
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // X.InterfaceC74234TBm
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // X.InterfaceC74234TBm
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // X.InterfaceC74234TBm, X.InterfaceC74235TBn
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // X.InterfaceC74234TBm
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    public AbstractC74233TBl(Object obj) {
        this(obj, null, null, null, false);
    }

    @Override // X.InterfaceC74234TBm
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // X.InterfaceC74234TBm
    public Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    public AbstractC74233TBl(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
