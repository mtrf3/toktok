package X;

/* renamed from: X.NnD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60403NnD extends AbstractC60629Nqr<C60401NnB> {
    public final /* synthetic */ C60643Nr5 LJLJL;

    @Override // X.AbstractC60629Nqr
    public final boolean LIZIZ() {
        return this.LJLJL.LJLJJI;
    }

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        for (String str : C47261Igj.LJJIJIIJI("onProgressChanged", "onReceivedTitle", "onReceivedIcon", "onReceivedTouchIconUrl", "onShowCustomView", "onHideCustomView", "onCreateWindow", "onRequestFocus", "onCloseWindow", "onJsAlert", "onJsConfirm", "onJsPrompt", "onJsBeforeUnload", "onExceededDatabaseQuota", "onReachedMaxAppCacheSize", "onGeolocationPermissionsShowPrompt", "onGeolocationPermissionsHidePrompt", "onPermissionRequest", "onPermissionRequestCanceled", "onJsTimeout", "onConsoleMessage", "getDefaultVideoPoster", "getVideoLoadingProgressView", "getVisitedHistory", "onShowFileChooser")) {
            C60404NnE LIZ = this.LJLJL.LJLJLLL.LIZ();
            LIZ.setCustomExtension(this);
            LJ(str, LIZ, 9000);
        }
    }

    public C60403NnD(C60643Nr5 c60643Nr5) {
        this.LJLJL = c60643Nr5;
    }
}
