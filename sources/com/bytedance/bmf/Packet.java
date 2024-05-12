package com.bytedance.bmf;

import com.bytedance.hmp.Ptr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes34.dex */
public class Packet extends Ptr {
    public boolean defined() {
        if (API.bmf_packet_defined(this.ptr) != 0) {
            return true;
        }
        return false;
    }

    public void free() {
        if (this.own) {
            API.bmf_packet_free(this.ptr);
        }
    }

    public long timestamp() {
        return API.bmf_packet_timestamp(this.ptr);
    }

    public static Packet generateEofPacket() {
        return wrap(API.bmf_packet_generate_eof_packet(), true);
    }

    public static Packet generateEosPacket() {
        return wrap(API.bmf_packet_generate_eos_packet(), true);
    }

    public Packet(Object obj) {
        if (obj == null) {
            this.ptr = 0L;
            this.own = false;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == VideoFrame.class) {
            this.ptr = API.bmf_packet_from_videoframe(((Ptr) obj).getPtr());
            this.own = true;
        } else if (cls == Packet.class) {
            this.ptr = ((Ptr) obj).getPtr();
            this.own = false;
        } else if (cls == JsonParam.class) {
            this.ptr = API.bmf_packet_from_json_param(((Ptr) obj).getPtr());
            this.own = true;
        } else {
            this.ptr = API.bmf_packet_from_json_str(GsonProtectorUtils.toJson(new Gson(), obj));
            this.own = true;
        }
    }

    public Object get(Class cls) {
        if (cls == VideoFrame.class) {
            return VideoFrame.wrap(API.bmf_packet_get_videoframe(this.ptr), true);
        }
        if (cls == JsonParam.class) {
            return JsonParam.wrap(API.bmf_packet_get_json_param(this.ptr), true);
        }
        if (API.bmf_packet_is_json_param(this.ptr)) {
            return GsonProtectorUtils.fromJson(new Gson(), API.bmf_packet_to_json_str(this.ptr), cls);
        }
        throw new ClassCastException(cls.getName());
    }

    public boolean is(Class cls) {
        if (cls == VideoFrame.class) {
            return API.bmf_packet_is_videoframe(this.ptr);
        }
        return API.bmf_packet_is_json_param(this.ptr);
    }

    public void setTimestamp(long j) {
        API.bmf_packet_set_timestamp(this.ptr, j);
    }

    public Packet(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static Packet wrap(long j, boolean z) {
        return new Packet(j, z);
    }
}
