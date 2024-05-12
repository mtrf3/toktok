package com.bytedance.bmf;

import X.C16880lQ;
import com.bytedance.hmp.Ptr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes34.dex */
public class ModuleFunctor extends Ptr {
    public boolean cleanup;
    public Class[] inputTypes;
    public Class[] outputTypes;

    public void free() {
        if (this.own) {
            API.bmf_module_functor_free(this.ptr);
        }
    }

    public Packet[] _inputs(Object[] objArr) {
        Class cls;
        if (objArr == null) {
            return new Packet[this.inputTypes.length];
        }
        int length = objArr.length;
        Class[] clsArr = this.inputTypes;
        if (length == clsArr.length) {
            int length2 = clsArr.length;
            Packet[] packetArr = new Packet[length2];
            for (int i = 0; i < objArr.length; i++) {
                try {
                    Object obj = objArr[i];
                    if (obj == null || (cls = this.inputTypes[i]) == null || cls.isInstance(obj)) {
                        packetArr[i] = new Packet(objArr[i]);
                    } else {
                        throw new IllegalArgumentException(C16880lQ.LLLZ("Expect input type %s at %d, got %s", new Object[]{this.inputTypes[i].getName(), Integer.valueOf(i), objArr[i].getClass().getName()}));
                    }
                } catch (Exception e) {
                    for (int i2 = 0; i2 < length2; i2++) {
                        Packet packet = packetArr[i2];
                        if (packet != null) {
                            packet.free();
                        }
                    }
                    throw e;
                }
            }
            return packetArr;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Expect %d inputs, got %d", new Object[]{Integer.valueOf(this.inputTypes.length), Integer.valueOf(objArr.length)}));
    }

    public Object[] call(Object... objArr) {
        Class cls;
        Packet[] _inputs = _inputs(objArr);
        int length = this.outputTypes.length;
        Packet[] packetArr = new Packet[length];
        int i = 0;
        try {
            long[] jArr = new long[_inputs.length];
            for (int i2 = 0; i2 < _inputs.length; i2++) {
                jArr[i2] = _inputs[i2].getPtr();
            }
            long[] bmf_module_functor_call = API.bmf_module_functor_call(this.ptr, jArr);
            if (bmf_module_functor_call != null) {
                if (bmf_module_functor_call.length != this.outputTypes.length) {
                    for (long j : bmf_module_functor_call) {
                        API.bmf_packet_free(j);
                    }
                    throw new IllegalStateException(C16880lQ.LLLZ("Expect %d outputs, got %d", new Object[]{Integer.valueOf(this.outputTypes.length), Integer.valueOf(bmf_module_functor_call.length)}));
                }
                for (int i3 = 0; i3 < bmf_module_functor_call.length; i3++) {
                    packetArr[i3] = Packet.wrap(bmf_module_functor_call[i3], true);
                }
                for (int i4 = 0; i4 < length; i4++) {
                    if (packetArr[i4].getPtr() != 0 && (cls = this.outputTypes[i4]) != null && !packetArr[i4].is(cls)) {
                        throw new IllegalStateException(C16880lQ.LLLZ("Invalid output packet type at port %d, expect %s", new Object[]{Integer.valueOf(i4), this.outputTypes[i4].getName()}));
                    }
                }
                Object[] objArr2 = new Object[bmf_module_functor_call.length];
                for (int i5 = 0; i5 < bmf_module_functor_call.length; i5++) {
                    objArr2[i5] = _output(packetArr[i5], i5);
                }
                for (Packet packet : _inputs) {
                    packet.free();
                }
                while (i < length) {
                    Packet packet2 = packetArr[i];
                    if (packet2 != null) {
                        packet2.free();
                    }
                    i++;
                }
                return objArr2;
            }
            throw new IllegalStateException("output pkt (opktPtrs) is null");
        } catch (Throwable unused) {
            for (Packet packet3 : _inputs) {
                packet3.free();
            }
            while (i < length) {
                Packet packet4 = packetArr[i];
                if (packet4 != null) {
                    packet4.free();
                }
                i++;
            }
            return null;
        }
    }

    public void execute(Object... objArr) {
        Packet[] _inputs = _inputs(objArr);
        int i = 0;
        try {
            long[] jArr = new long[_inputs.length];
            for (int i2 = 0; i2 < _inputs.length; i2++) {
                jArr[i2] = _inputs[i2].getPtr();
            }
            API.bmf_module_functor_execute(this.ptr, jArr, this.cleanup);
        } finally {
            while (i < _inputs.length) {
                _inputs[i].free();
                i++;
            }
        }
    }

    public Object[] fetch(int i) {
        Class cls;
        long[] bmf_module_functor_fetch = API.bmf_module_functor_fetch(this.ptr, i);
        int length = bmf_module_functor_fetch.length;
        Packet[] packetArr = new Packet[length];
        int i2 = 0;
        for (int i3 = 0; i3 < bmf_module_functor_fetch.length; i3++) {
            packetArr[i3] = Packet.wrap(bmf_module_functor_fetch[i3], true);
        }
        for (int i4 = 0; i4 < length; i4++) {
            try {
                if (packetArr[i4].getPtr() != 0 && (cls = this.outputTypes[i]) != null && !packetArr[i4].is(cls)) {
                    throw new IllegalStateException(C16880lQ.LLLZ("Invalid output packet type at %d from port %d, expect %s", new Object[]{Integer.valueOf(i4), Integer.valueOf(i), this.outputTypes[i].getName()}));
                }
            } finally {
                while (i2 < length) {
                    packetArr[i2].free();
                    i2++;
                }
            }
        }
        Object[] objArr = new Object[bmf_module_functor_fetch.length];
        for (int i5 = 0; i5 < bmf_module_functor_fetch.length; i5++) {
            objArr[i5] = _output(packetArr[i5], i);
        }
        return objArr;
    }

    public ModuleFunctor(long j, boolean z) {
        this.cleanup = true;
        this.ptr = j;
        this.own = z;
    }

    public static ModuleFunctor wrap(long j, boolean z) {
        return new ModuleFunctor(j, z);
    }

    public Object _output(Packet packet, int i) {
        if (packet.getPtr() == 0) {
            return null;
        }
        Class cls = this.outputTypes[i];
        if (cls == null) {
            return packet;
        }
        return packet.get(cls);
    }

    public ModuleFunctor(ModuleInfo moduleInfo, Object obj, Class[] clsArr, Class[] clsArr2) {
        this.cleanup = true;
        this.ptr = API.bmf_module_functor_make(moduleInfo.name, moduleInfo.type, moduleInfo.path, moduleInfo.entry, GsonProtectorUtils.toJson(new Gson(), obj), clsArr.length, clsArr2.length, -1);
        this.own = true;
        this.inputTypes = clsArr;
        this.outputTypes = clsArr2;
    }

    public ModuleFunctor(ModuleInfo moduleInfo, Object obj, Class[] clsArr, Class[] clsArr2, boolean z) {
        this(moduleInfo, obj, clsArr, clsArr2);
        this.cleanup = z;
    }
}
