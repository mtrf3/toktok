package X;

/* renamed from: X.Xfp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85425Xfp extends AbstractC37594EpC<InterfaceC85426Xfq, InterfaceC85424Xfo> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26135"));

    @InterfaceC37838Et8(params = {"memoryAll", "memoryUse", "memoryRest", "memoryLimit", "cpuUsage", "temperature"}, results = {"memoryAll", "memoryUse", "memoryRest", "memoryLimit", "cpuUsage", "temperature"})
    public final String LJLILLLLZI = "x.getDeviceStatus";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
