package kotlinx.coroutines.flow;

import X.AbstractC79813Bh;
import X.C3CK;
import X.C76800UCe;
import X.C79873Bn;
import X.C79943Bu;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.MBA;
import X.MBB;
import X.XKI;
import X.XKM;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChannelAsFlow<T> extends AbstractC79813Bh<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");
    public final XKM<T> channel;
    public final boolean consume;
    public volatile /* synthetic */ int consumed;

    private final void markConsumed() {
        if (!this.consume || consumed$FU.getAndSet(this, 1) == 0) {
            return;
        }
        "ReceiveChannel.consumeAsFlow can be collected just once".toString();
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    @Override // X.AbstractC79813Bh
    public String additionalToStringProps() {
        return o.LJIILLIIL(this.channel, "channel=");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC79813Bh
    public InterfaceC65462ha<T> dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume, null, 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    @Override // X.AbstractC79813Bh
    public XKM<T> produceImpl(InterfaceC70422pa interfaceC70422pa) {
        markConsumed();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.produceImpl(interfaceC70422pa);
    }

    @Override // X.AbstractC79813Bh, X.InterfaceC65462ha
    public Object collect(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (this.capacity == -3) {
            markConsumed();
            Object LIZIZ = C79943Bu.LIZIZ(interfaceC64672gJ, this.channel, this.consume, interfaceC67352kd);
            if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZIZ;
            }
            return C76800UCe.LIZ;
        }
        Object collect = super.collect(interfaceC64672gJ, interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public Object collectTo(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZIZ = C79943Bu.LIZIZ(new C79873Bn(c3ck), this.channel, this.consume, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public AbstractC79813Bh<T> create(MBA mba, int i, XKI xki) {
        return new ChannelAsFlow(this.channel, this.consume, mba, i, xki);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(XKM<? extends T> xkm, boolean z, MBA mba, int i, XKI xki) {
        super(mba, i, xki);
        this.channel = xkm;
        this.consume = z;
    }

    public /* synthetic */ ChannelAsFlow(XKM xkm, boolean z, MBA mba, int i, XKI xki, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xkm, z, (i2 & 4) != 0 ? MBB.INSTANCE : mba, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? XKI.SUSPEND : xki);
    }
}
