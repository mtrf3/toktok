package X;

/* loaded from: classes8.dex */
public final class HBZ extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final HBZ LJLIL = new HBZ();

    public HBZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j = 60000;
        if (C60903NvH.LJIIJJI().LJJIII().enable3MinRecord()) {
            j = Math.max(60000L, 180000L);
        }
        if (C43464H4a.LIZ()) {
            j = Math.max(j, C60903NvH.LJIIJJI().LJJIFFI().importLongVideoThreshold());
        }
        return Long.valueOf(j);
    }
}
