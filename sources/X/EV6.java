package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EV6 implements C5H3<InterfaceC214228aw<Object>> {
    public InterfaceC214228aw<Object> LJLIL;
    public final /* synthetic */ InterfaceC65350Pko<? extends InterfaceC214228aw<Object>> LJLILLLLZI;
    public final /* synthetic */ AssemViewModel<Object> LJLJI;

    @Override // X.C5H3
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C5H3
    public final InterfaceC214228aw<Object> getValue() {
        InterfaceC214228aw<Object> interfaceC214228aw = this.LJLIL;
        if (interfaceC214228aw == null) {
            InterfaceC65350Pko<? extends InterfaceC214228aw<Object>> repositoryClazz = this.LJLILLLLZI;
            o.LJIIIZ(repositoryClazz, "repositoryClazz");
            if (InterfaceC214228aw.class.isAssignableFrom(C39557Ffl.LIZ(repositoryClazz))) {
                try {
                    Object newInstance = C39557Ffl.LIZ(repositoryClazz).newInstance();
                    o.LJIIIIZZ(newInstance, "{\n                reposi…wInstance()\n            }");
                    interfaceC214228aw = (InterfaceC214228aw) newInstance;
                    AssemViewModel<Object> assemViewModel = this.LJLJI;
                    this.LJLIL = interfaceC214228aw;
                    assemViewModel.putCreatedRepository(interfaceC214228aw);
                } catch (IllegalAccessException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Cannot create an instance of ");
                    LIZ.append(repositoryClazz);
                    throw new RuntimeException(X1D.LIZIZ(LIZ), e);
                } catch (InstantiationException e2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Cannot create an instance of ");
                    LIZ2.append(repositoryClazz);
                    throw new RuntimeException(X1D.LIZIZ(LIZ2), e2);
                } catch (NoSuchMethodException e3) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Cannot create an instance of ");
                    LIZ3.append(repositoryClazz);
                    throw new RuntimeException(X1D.LIZIZ(LIZ3), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Cannot create an instance of ");
                    LIZ4.append(repositoryClazz);
                    throw new RuntimeException(X1D.LIZIZ(LIZ4), e4);
                }
            } else {
                throw new IllegalArgumentException("Custom Model must be a subclass of AssemModel<ModelOperator>.");
            }
        }
        return interfaceC214228aw;
    }

    public EV6(AssemViewModel assemViewModel, C65776Prg c65776Prg) {
        this.LJLILLLLZI = c65776Prg;
        this.LJLJI = assemViewModel;
    }
}
