package X;

/* renamed from: X.Gi8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42252Gi8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C42252Gi8 LJLIL = new C42252Gi8();

    public C42252Gi8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personalization_data");
        FMX.LJIIL("enter_data_download", c188727au.LIZ);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("privacy_monitor_param_name", "DownloadYourDataItem");
        c198517qh.LIZ.put("privacy_monitor_param_type", "unregistered");
        C09900aA.LJI("privacy_monitor_event_item_click", c198517qh.LJ(), null, null);
        return C76800UCe.LIZ;
    }
}
