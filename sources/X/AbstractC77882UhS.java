package X;

/* renamed from: X.UhS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77882UhS extends AbstractC37594EpC<InterfaceC77884UhU, InterfaceC77889UhZ> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "16589"));

    @InterfaceC37838Et8(params = {"identifier", "repeatFrequency", "repeatInterval", "repeatCount", "startDate", "endDate", "alarmOffset", "allDay", "title", "notes", "location", "url", "calendarName", "_jsb_secure_dataflow_id"}, results = {""})
    public final String LJLILLLLZI = "x.createCalendarEvent";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.SECURE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
