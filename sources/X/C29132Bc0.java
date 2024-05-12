package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Bc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29132Bc0 implements InterfaceC30837C8j {
    public final /* synthetic */ PreviewStartLiveWidget LIZ;
    public final /* synthetic */ Room LIZIZ;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        EnumC30836C8i.LiveResource.load(this.LIZ.context, false);
        this.LIZ.LLIIII(this.LIZIZ);
    }

    public C29132Bc0(PreviewStartLiveWidget previewStartLiveWidget, Room room) {
        this.LIZ = previewStartLiveWidget;
        this.LIZIZ = room;
    }
}
