package X;

/* renamed from: X.UhW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77886UhW extends AbstractC37594EpC<InterfaceC77887UhX, InterfaceC77888UhY> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26103"));

    @InterfaceC37838Et8(params = {"eventID", "startDate", "endDate", "alarmOffset", "allDay", "title", "notes", "location", "url"}, results = {"eventID"})
    public final String LJLILLLLZI = "x.setCalendarEvent";
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
