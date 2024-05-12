package X;

import defpackage.i0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.IuX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48117IuX implements InterfaceC48118IuY {
    @Override // X.InterfaceC48118IuY
    public final List<InetAddress> LIZ(String str) {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException(i0.LJFF("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
        throw new UnknownHostException("hostname == null");
    }
}
