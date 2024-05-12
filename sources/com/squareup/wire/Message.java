package com.squareup.wire;

import X.C64533PUj;
import X.C64537PUn;
import X.PVU;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

/* loaded from: classes12.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient ProtoAdapter<M> adapter;
    public transient int cachedSerializedSize;
    public transient int hashCode;
    public final transient C64537PUn unknownFields;

    /* loaded from: classes12.dex */
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        public transient C64537PUn LIZ = C64537PUn.EMPTY;
        public transient C64533PUj LIZIZ;
        public transient ProtoWriter LIZJ;

        public abstract M build();

        public final void LIZ() {
            if (this.LIZIZ == null) {
                C64533PUj c64533PUj = new C64533PUj();
                this.LIZIZ = c64533PUj;
                ProtoWriter protoWriter = new ProtoWriter(c64533PUj);
                this.LIZJ = protoWriter;
                try {
                    protoWriter.writeBytes(this.LIZ);
                    this.LIZ = C64537PUn.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final C64537PUn buildUnknownFields() {
            C64533PUj c64533PUj = this.LIZIZ;
            if (c64533PUj != null) {
                this.LIZ = c64533PUj.LJIIL();
                this.LIZIZ = null;
                this.LIZJ = null;
            }
            return this.LIZ;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.LIZ = C64537PUn.EMPTY;
            C64533PUj c64533PUj = this.LIZIZ;
            if (c64533PUj != null) {
                c64533PUj.LIZ();
                this.LIZIZ = null;
            }
            this.LIZJ = null;
            return this;
        }

        public final Builder<M, B> addUnknownFields(C64537PUn c64537PUn) {
            if (c64537PUn.size() > 0) {
                LIZ();
                try {
                    this.LIZJ.writeBytes(c64537PUn);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            LIZ();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.LIZJ, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: newBuilder */
    public abstract Builder<M, B> newBuilder2();

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final C64537PUn unknownFields() {
        C64537PUn c64537PUn = this.unknownFields;
        if (c64537PUn != null) {
            return c64537PUn;
        }
        return C64537PUn.EMPTY;
    }

    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final M withoutUnknownFields() {
        Builder<M, B> newBuilder2 = newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(PVU pvu) {
        this.adapter.encode(pvu, (PVU) this);
    }

    public final void encode(OutputStream outputStream) {
        this.adapter.encode(outputStream, (OutputStream) this);
    }

    public Message(ProtoAdapter<M> protoAdapter, C64537PUn c64537PUn) {
        if (protoAdapter != null) {
            if (c64537PUn != null) {
                this.adapter = protoAdapter;
                this.unknownFields = c64537PUn;
                return;
            }
            throw new NullPointerException("unknownFields == null");
        }
        throw new NullPointerException("adapter == null");
    }
}
