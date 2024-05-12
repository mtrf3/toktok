package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes12.dex */
public final class MessageSerializedForm<M extends Message<M, B>, B extends Message.Builder<M, B>> implements Serializable {
    public static final long serialVersionUID = 0;
    public final byte[] LJLIL;
    public final Class<M> LJLILLLLZI;

    public Object readResolve() {
        try {
            return ProtoAdapter.get(this.LJLILLLLZI).decode(this.LJLIL);
        } catch (IOException e) {
            throw new StreamCorruptedException(e.getMessage());
        }
    }

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.LJLIL = bArr;
        this.LJLILLLLZI = cls;
    }
}
