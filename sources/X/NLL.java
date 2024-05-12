package X;

/* loaded from: classes11.dex */
public enum NLL implements InterfaceC58699N1z<String> {
    SELECT("select"),
    CHECK_GECKO_START("check_gecko_start"),
    CHECK_GECKO_SUCCESS("check_gecko_success"),
    LOAD_START("load_start"),
    LOAD_FAIL("load_fail"),
    LOAD_SUCCESS("load_success"),
    SHOW("show"),
    SHAKE("shake"),
    LYNX_READY("lynx_ready"),
    START_PLAY("start_play"),
    LYNX_FINISH("lynx_finish"),
    OPEN_LANDINGPAGE("open_landingpage"),
    CONTAINER_ON_TOP("container_on_top");

    public final String LJLIL;

    public static NLL valueOf(String str) {
        return (NLL) V0N.LJJJ(NLL.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NLL(String str) {
        this.LJLIL = str;
    }
}
