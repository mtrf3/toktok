package webcast.api.interaction;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PinMessage;
import webcast.data.InteractionConflict;

/* loaded from: classes6.dex */
public final class PinResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("interaction_conflict")
        public InteractionConflict interactionConflict;

        @InterfaceC65349Pkn("pin_msg")
        public PinMessage pinMsg;

        @InterfaceC65349Pkn("status")
        public int status;
    }
}
