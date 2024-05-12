package com.bytedance.bmf;

import com.bytedance.hmp.Ptr;

/* loaded from: classes34.dex */
public class Task extends Ptr {
    public void free() {
        if (this.own) {
            API.bmf_task_free(this.ptr);
        }
    }

    public int[] getInputStreamIds() {
        return API.bmf_task_get_input_stream_ids(this.ptr);
    }

    public int[] getOutputStreamIds() {
        return API.bmf_task_get_output_stream_ids(this.ptr);
    }

    public long timestamp() {
        return API.bmf_task_timestamp(this.ptr);
    }

    public Packet popPacketFromInputQueue(int i) {
        return Packet.wrap(API.bmf_task_pop_packet_from_input_queue(this.ptr, i), true);
    }

    public Packet popPacketFromOutputQueue(int i) {
        return Packet.wrap(API.bmf_task_pop_packet_from_out_queue(this.ptr, i), true);
    }

    public void setTimestamp(long j) {
        API.bmf_task_set_timestamp(this.ptr, j);
    }

    public Task(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static Task wrap(long j, boolean z) {
        return new Task(j, z);
    }

    public void fillInputPacket(int i, Packet packet) {
        API.bmf_task_fill_input_packet(this.ptr, i, packet.getPtr());
    }

    public void fillOutputPacket(int i, Packet packet) {
        API.bmf_task_fill_output_packet(this.ptr, i, packet.getPtr());
    }

    public Task(int i, int[] iArr, int[] iArr2) {
        this.ptr = API.bmf_task_make(i, iArr, iArr2);
        this.own = true;
    }
}
