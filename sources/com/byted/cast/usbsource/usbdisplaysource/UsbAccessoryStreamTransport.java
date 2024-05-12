package com.byted.cast.usbsource.usbdisplaysource;

import android.os.ParcelFileDescriptor;
import com.byted.cast.usbsource.usbcommon.Logger;
import com.byted.cast.usbsource.usbcommon.Transport;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes29.dex */
public class UsbAccessoryStreamTransport extends Transport {
    public ParcelFileDescriptor mFd;
    public FileInputStream mInputStream;
    public FileOutputStream mOutputStream;

    @Override // com.byted.cast.usbsource.usbcommon.Transport
    public void flush() {
        FileOutputStream fileOutputStream = this.mOutputStream;
        if (fileOutputStream != null) {
            fileOutputStream.flush();
            return;
        }
        throw new IOException("Stream was closed.");
    }

    @Override // com.byted.cast.usbsource.usbcommon.Transport
    public void ioClose() {
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.mFd;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException unused) {
        }
        this.mFd = null;
        this.mInputStream = null;
        this.mOutputStream = null;
    }

    public UsbAccessoryStreamTransport(Logger logger, ParcelFileDescriptor parcelFileDescriptor) {
        super(logger, 16384);
        this.mFd = parcelFileDescriptor;
        this.mInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        this.mOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
    }

    @Override // com.byted.cast.usbsource.usbcommon.Transport
    public int ioRead(byte[] bArr, int i, int i2) {
        FileInputStream fileInputStream = this.mInputStream;
        if (fileInputStream != null) {
            return fileInputStream.read(bArr, i, i2);
        }
        throw new IOException("Stream was closed.");
    }

    @Override // com.byted.cast.usbsource.usbcommon.Transport
    public void ioWrite(byte[] bArr, int i, int i2) {
        FileOutputStream fileOutputStream = this.mOutputStream;
        if (fileOutputStream != null) {
            fileOutputStream.write(bArr, i, i2);
            return;
        }
        throw new IOException("Stream was closed.");
    }
}
