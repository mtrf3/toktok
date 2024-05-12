package X;

/* loaded from: classes8.dex */
public final class IAI implements InterfaceC74346TFu {
    public boolean LJLIL;

    @Override // X.InterfaceC74346TFu
    public final void LJLLLL() {
        G8G.LIZ.step("tool_performance_open_choose_sticker", "start_sticker_anim");
    }

    @Override // X.InterfaceC74346TFu
    public final void start() {
        G8G.LIZ.start("tool_performance_open_choose_sticker", "click_open_sticker");
    }

    @Override // X.InterfaceC74346TFu
    public final void LIZ(String str) {
        boolean z;
        if (!this.LJLIL) {
            G8G.LIZ.step("tool_performance_open_choose_sticker", str);
            z = true;
        } else {
            G8G.LIZ.end("tool_performance_open_choose_sticker", str);
            z = false;
        }
        this.LJLIL = z;
    }
}
