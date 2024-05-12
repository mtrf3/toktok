package com.google.android.gms.common.data;

import X.C16880lQ;
import X.C67299Qb9;
import X.C79057V0z;
import X.QH7;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C67299Qb9();
    public final int LJLIL;
    public ParcelFileDescriptor LJLILLLLZI;
    public final int LJLJI;
    public Bitmap zad;
    public boolean zae;
    public File zaf;

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.LJLILLLLZI == null) {
            Bitmap bitmap = this.zad;
            QH7.LJIIIIZZ(bitmap);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.zaf;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.LJLILLLLZI = ParcelFileDescriptor.open(createTempFile, 268435456);
                        C16880lQ.LLLZZIL(createTempFile);
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                                try {
                                    dataOutputStream.close();
                                } catch (IOException unused) {
                                }
                            } catch (IOException e) {
                                throw new IllegalStateException("Could not write into unlinked file", e);
                            }
                        } catch (Throwable th) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException unused2) {
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused3) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.LJLILLLLZI, i | 1, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.LJLJI);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
        this.LJLILLLLZI = null;
    }

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = parcelFileDescriptor;
        this.LJLJI = i2;
    }
}
