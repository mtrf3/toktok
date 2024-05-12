package X;

import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;

/* renamed from: X.OtI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC63328OtI {
    void LIZ(Long l, DeleteMessageRequestBody deleteMessageRequestBody);

    void LIZIZ(Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody);

    void init();

    java.util.Map<Long, DeleteMsgRequest> trigger();
}
