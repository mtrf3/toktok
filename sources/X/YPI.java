package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes16.dex */
public final class YPI implements XmlSerializer {
    public static final String[] LJII = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public int LIZIZ;
    public Writer LIZJ;
    public OutputStream LIZLLL;
    public CharsetEncoder LJ;
    public boolean LJI;
    public final char[] LIZ = new char[FileUtils.BUFFER_SIZE];
    public final ByteBuffer LJFF = ByteBuffer.allocate(FileUtils.BUFFER_SIZE);

    public final void LJ() {
        int position = this.LJFF.position();
        if (position > 0) {
            this.LJFF.flip();
            this.LIZLLL.write(this.LJFF.array(), 0, position);
            this.LJFF.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() {
        int i = this.LIZIZ;
        if (i > 0) {
            if (this.LIZLLL != null) {
                CharBuffer wrap = CharBuffer.wrap(this.LIZ, 0, i);
                CoderResult encode = this.LJ.encode(wrap, this.LJFF, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        LJ();
                        encode = this.LJ.encode(wrap, this.LJFF, true);
                    } else {
                        LJ();
                        this.LIZLLL.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.LIZJ.write(this.LIZ, 0, i);
            this.LIZJ.flush();
            this.LIZIZ = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() {
        flush();
    }

    public final void LIZ(char c) {
        int i = this.LIZIZ;
        if (i >= 8191) {
            flush();
            i = this.LIZIZ;
        }
        this.LIZ[i] = c;
        this.LIZIZ = i + 1;
    }

    public final void LIZLLL(String str) {
        String str2;
        int length = str.length();
        String[] strArr = LJII;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    LIZIZ(str, i2, i - i2);
                }
                i2 = i + 1;
                LIZIZ(str2, 0, str2.length());
            }
            i++;
        }
        if (i2 < i) {
            LIZIZ(str, i2, i - i2);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.LIZJ = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) {
        if (this.LJI) {
            LIZIZ(">", 0, 1);
            this.LJI = false;
        }
        LIZLLL(str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) {
        if (this.LJI) {
            LIZIZ(" />\n", 0, 4);
        } else {
            LIZIZ("</", 0, 2);
            if (str != null) {
                LIZIZ(str, 0, str.length());
                LIZ(':');
            }
            LIZIZ(str2, 0, str2.length());
            LIZIZ(">\n", 0, 2);
        }
        this.LJI = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.LJ = Charset.forName(str).newEncoder();
                this.LIZLLL = outputStream;
                return;
            } catch (IllegalCharsetNameException e) {
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        String LJFF = JBR.LJFF(LIZ, str2, "' ?>\n", LIZ);
        LIZIZ(LJFF, 0, LJFF.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) {
        if (this.LJI) {
            LIZIZ(">\n", 0, 2);
        }
        LIZ('<');
        if (str != null) {
            LIZIZ(str, 0, str.length());
            LIZ(':');
        }
        LIZIZ(str2, 0, str2.length());
        this.LJI = true;
        return this;
    }

    public final void LIZIZ(String str, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + FileUtils.BUFFER_SIZE;
                if (i5 < i4) {
                    i3 = FileUtils.BUFFER_SIZE;
                } else {
                    i3 = i4 - i;
                }
                LIZIZ(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.LIZIZ;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.LIZIZ;
        }
        str.getChars(i, i + i2, this.LIZ, i6);
        this.LIZIZ = i6 + i2;
    }

    public final void LIZJ(char[] cArr, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + FileUtils.BUFFER_SIZE;
                if (i5 < i4) {
                    i3 = FileUtils.BUFFER_SIZE;
                } else {
                    i3 = i4 - i;
                }
                LIZJ(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.LIZIZ;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.LIZIZ;
        }
        System.arraycopy(cArr, i, this.LIZ, i6, i2);
        this.LIZIZ = i6 + i2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) {
        LIZ(' ');
        if (str != null) {
            LIZIZ(str, 0, str.length());
            LIZ(':');
        }
        LIZIZ(str2, 0, str2.length());
        LIZIZ("=\"", 0, 2);
        LIZLLL(str3);
        LIZ('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        if (this.LJI) {
            LIZIZ(">", 0, 1);
            this.LJI = false;
        }
        String[] strArr = LJII;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    LIZJ(cArr, i4, i - i4);
                }
                i4 = i + 1;
                LIZIZ(str, 0, str.length());
            }
            i++;
        }
        if (i4 < i) {
            LIZJ(cArr, i4, i - i4);
        }
        return this;
    }
}
